import java.util.*;
import java.util.stream.Collectors;

public class ChainblockImpl implements Chainblock {
    private HashMap<Integer, Transaction> transactions;

    public ChainblockImpl() {
        this.transactions = new HashMap<>();
    }

    public int getCount() {
        return transactions.size();
    }

    public void add(Transaction transaction) {
        transactions.putIfAbsent(transaction.getId(), transaction);
    }

    public boolean contains(Transaction transaction) {
        return transactions.containsKey(transaction.getId());
    }

    public boolean contains(int id) {
        return transactions.containsKey(id);
    }

    public void changeTransactionStatus(int id, TransactionStatus newStatus) {
        if (transactions.containsKey(id)) {
            transactions.get(id).setStatus(newStatus);
        } else {
            throw new IllegalArgumentException("Transaction not exist");
        }
    }

    public void removeTransactionById(int id) {
        if (transactions.containsKey(id)) {
            transactions.remove(id);
        } else {
            throw new IllegalArgumentException("No such Transaction");
        }
    }

    public Transaction getById(int id) {
        if (transactions.containsKey(id)) {
            return transactions.get(id);
        }
        throw new IllegalArgumentException("No such Transaction");
    }

    public Iterable<Transaction> getByTransactionStatus(TransactionStatus status) {
        List<Transaction> result = transactions.values().stream().filter(t -> t.getStatus().equals(status))
                .sorted(Comparator.comparing(Transaction::getAmount))
                .collect(Collectors.toList());

        if (result.size() > 0) {
            return result;
        } else {
            throw new IllegalArgumentException("No such Transactions");
        }
    }

    public Iterable<String> getAllSendersWithTransactionStatus(TransactionStatus status) {
        List<String> result = transactions.values()
                .stream().filter(t -> t.getStatus().equals(status))
                .sorted(Comparator.comparing(Transaction::getAmount))
                .map(Transaction::getFrom).collect(Collectors.toList());

        if (result.size() > 0) {
            return result;
        } else {
            throw new IllegalArgumentException("No such senders");
        }
    }

    public Iterable<String> getAllReceiversWithTransactionStatus(TransactionStatus status) {
        List<String> result = transactions.values().stream()
                .filter(t -> t.getStatus().equals(status))
                .sorted(Comparator.comparing(Transaction::getAmount))
                .map(Transaction::getFrom).collect(Collectors.toList());

        if (result.size() > 0) {
            return result;
        }
        throw new IllegalArgumentException("No such TransactionStatus");
    }

    public Iterable<Transaction> getAllOrderedByAmountDescendingThenById() {
        List<Transaction> result = transactions.values().stream()
                .sorted(Comparator.comparing(Transaction::getAmount))
                .sorted(Comparator.comparing(Transaction::getId))
                .collect(Collectors.toList());
        if (result.size() > 0) {
            return result;
        }
        throw new IllegalArgumentException("No such Transactions");
    }

    public Iterable<Transaction> getBySenderOrderedByAmountDescending(String sender) {
        List<Transaction> result = transactions.values().stream()
                .filter(t -> t.getFrom().equals(sender))
                .sorted(Comparator.comparing(Transaction::getAmount))
                .collect(Collectors.toList());
        if (result.size() > 0) {
            return result;
        }
        throw new IllegalArgumentException("No such Transactions");
    }

    public Iterable<Transaction> getByReceiverOrderedByAmountThenById(String receiver) {
        return null;
    }

    public Iterable<Transaction> getByTransactionStatusAndMaximumAmount(TransactionStatus status, double amount) {
        return null;
    }

    public Iterable<Transaction> getBySenderAndMinimumAmountDescending(String sender, double amount) {
        return null;
    }

    public Iterable<Transaction> getByReceiverAndAmountRange(String receiver, double lo, double hi) {
        return null;
    }

    public Iterable<Transaction> getAllInAmountRange(double lo, double hi) {
        return null;
    }

    public Iterator<Transaction> iterator() {
        return null;
    }
}
