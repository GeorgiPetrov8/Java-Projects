import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ChainblockImplTest {
    private static final int ID = 8188;
    private Chainblock chainblock;
    private Transaction transaction;
    private Transaction[] transactionsList;

    @Before
    public void setUp() {
        this.chainblock = new ChainblockImpl();
        this.transaction = new TransactionImpl
                (ID,TransactionStatus.SUCCESSFUL,"Gosho","Pesho",200.0);
    }

    @Test
    public void Test_addTransactionToTheRecord() {
        this.chainblock.add(transaction);

        assertTrue(this.chainblock.contains(ID));
    }

    @Test
    public void Test_containsShouldWorkProperty() {
        assertFalse(this.chainblock.contains(transaction));

        this.chainblock.add(transaction);

        assertTrue(this.chainblock.contains(ID));
        assertTrue(this.chainblock.contains(transaction));
    }

    @Test
    public void Test_getCountShouldReturnZeroForEmptyChainBlock() {
        int actual = chainblock.getCount();

        assertEquals(0,actual);
    }

    @Test
    public void Test_getCountShouldReturnOneTransaction() {
        chainblock.add(transaction);

        int actualSize = chainblock.getCount();

        assertEquals(1,actualSize);
    }

    @Test
    public void Test_getCountShouldReturnFourTransaction() {
        addTransactions(4);

        int actualCount = chainblock.getCount();

        assertEquals(4,actualCount);
    }

    @Test
    public void Test_changeTransactionStatus() {
        addTransactions(4);
        chainblock.add(transaction);

        TransactionStatus newStatus = TransactionStatus.ABORTED;
        chainblock.changeTransactionStatus(ID,newStatus);

        Transaction testStatusTr = chainblock.getById(ID);

        assertEquals(newStatus,testStatusTr.getStatus());
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_changeTransactionShouldThrowIfThereIsNoSuchTransaction() {
        addTransactions(3);

        chainblock.changeTransactionStatus(ID,TransactionStatus.ABORTED);
    }

    @Test
    public void Test_removeTrByIdShouldWorkProperty() {
        addTransactions(2);
        chainblock.add(transaction);

        chainblock.removeTransactionById(transaction.getId());

        assertFalse(chainblock.contains(transaction.getId()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_removeByIdShouldThrowIfThereIsNotTransaction() {
        addTransactions(4);

        chainblock.removeTransactionById(ID);
    }

    @Test
    public void Test_getByIdReturnTransactionWithGivenId() {
        chainblock.add(transaction);

        Transaction testTr = chainblock.getById(transaction.getId());

        assertEquals(ID,testTr.getId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_getByIdShouldThrowIfThereIsNotSuchId() {
        addTransactions(4);

        chainblock.getById(4444);
    }

    @Test
    public void Test_getByTransactionStatusReturnTrCollectionWithGivenStatus() {
        addTransactions(4);

        List<Transaction> expected = Arrays.stream(transactionsList)
                .filter(t -> t.getStatus().equals(TransactionStatus.UNAUTHORIZED))
                .sorted(Comparator.comparing(Transaction::getAmount))
                .collect(Collectors.toList());

        Iterable<Transaction> iterable = chainblock.getByTransactionStatus(expected.get(0).getStatus());
        assertNotNull(iterable);

        List<Transaction> actual = new ArrayList<>();
        iterable.forEach(actual::add);

        ensureListsAreEquals(expected, actual);
    }


    @Test(expected = IllegalArgumentException.class)
    public void Test_getByTransactionStatusShouldThrowIfThereIsNoSuchStatus() {
        addTransactions(5);

        chainblock.getByTransactionStatus(TransactionStatus.FAILED);
    }

    @Test
    public void Test_getAllSendersWithTransactionStatusWorkCorrect() {
        addTransactions(4);

        List<String> expected = Arrays.stream(transactionsList)
                .filter(t -> t.getStatus().equals(TransactionStatus.UNAUTHORIZED))
                .sorted(Comparator.comparing(Transaction::getAmount))
                .map(Transaction::getFrom).collect(Collectors.toList());

        Iterable<String> iterable = chainblock.getAllSendersWithTransactionStatus(TransactionStatus.UNAUTHORIZED);
        assertNotNull(iterable);

        List<String> actual = new ArrayList<>();
        iterable.forEach(actual::add);

        assertEquals(expected.size(),actual.size());

        assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_getAllSendersWithTransactionStatusShouldThrowException() {
        addTransactions(4);

        chainblock.getAllSendersWithTransactionStatus(TransactionStatus.FAILED);
    }

    @Test
    public void Test_getAllReceiversWithTransactionStatusShouldWorkCorrect() {
        addTransactions(4);

        List<String> expected = Arrays.stream(transactionsList)
                .filter(t -> t.getStatus().equals(TransactionStatus.UNAUTHORIZED))
                .sorted(Comparator.comparing(Transaction::getAmount))
                .map(Transaction::getTo).collect(Collectors.toList());

        Iterable<String> iterable = chainblock.getAllSendersWithTransactionStatus(TransactionStatus.UNAUTHORIZED);
        assertNotNull(iterable);

        List<String> actual = new ArrayList<>();
        iterable.forEach(actual::add);

        assertEquals(expected.size(),actual.size());

        assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_getAllReceiversWithTransactionStatusThrowException() {
        chainblock.getAllReceiversWithTransactionStatus(TransactionStatus.FAILED);
    }

    @Test
    public void Test_getAllOrderedByAmountDescendingThenById() {
        addTransactions(5);

        List<Transaction> expected = Arrays.stream(transactionsList)
                .sorted(Comparator.comparing(Transaction::getAmount))
                .sorted(Comparator.comparing(Transaction::getId))
                .collect(Collectors.toList());

        Iterable<Transaction> iterable = chainblock.getAllOrderedByAmountDescendingThenById();
        assertNotNull(iterable);

        List<Transaction> actual = new ArrayList<>();
        iterable.forEach(actual::add);

        ensureListsAreEquals(expected,actual);
    }

    @Test
    public void Test_getBySenderOrderedByAmountDescending() {
        addTransactions(5);
        chainblock.add(transaction);

        List<Transaction> expected = Arrays.stream(transactionsList)
                .filter(t -> t.getFrom().equals(""))
                .sorted(Comparator.comparing(Transaction::getAmount))
                .collect(Collectors.toList());

        Iterable<Transaction> iterable = chainblock.getBySenderOrderedByAmountDescending("");
        assertNotNull(iterable);

        List<Transaction> actual = loadActualList(iterable);

        ensureListsAreEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_getBySenderOrderedByAmountDescendingShouldThrow() {
        addTransactions(4);

        Iterable<Transaction> iterable = chainblock.getBySenderOrderedByAmountDescending("Mario");
    }
    
    private List<Transaction> loadActualList(Iterable<Transaction> iterable) {
        List<Transaction> actual = new ArrayList<>();
        iterable.forEach(actual::add);

        return actual;
    }


    private void ensureListsAreEquals(List<Transaction> expected, List<Transaction> actual) {
        assertEquals(expected.size(),actual.size());

        for (int i = 0; i < expected.size() ; i++) {
            assertEquals(expected.get(i),actual.get(i));
        }
    }

    private void addTransactions(int count) {
        this.transactionsList = new Transaction[count];

        for (int i = 0; i < count ; i++) {
            transactionsList[i] = new TransactionImpl(i + 888,
                    TransactionStatus.UNAUTHORIZED,
                    "","",
                    i + i);
            chainblock.add(transactionsList[i]);
        }

    }

}