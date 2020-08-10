package p01_Database;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {

    Database database;

    @Before
    public void intiDataBase() throws OperationNotSupportedException {
        this.database = new Database(1,2,3,4,5);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void Test_IfTheSizeIsNot16ShouldThrowException() throws OperationNotSupportedException {
        Integer[] elements = new Integer[17];
        Database database = new Database(elements);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void Test_ifPassedElementIsNullShouldTrowException() throws OperationNotSupportedException {
        Integer input = null;
        database.add(input);
    }

    @Test
    public void Test_addShouldAddAnElementAtTheNextFreeCell() throws OperationNotSupportedException {
        Integer numberToAdd = 3;
        database.add(numberToAdd);

        Integer expected = database.getElements()[database.getElements().length - 1];

        assertEquals(expected, numberToAdd);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void Test_removingElementFromEmptyDataBaseShouldThrowException() throws OperationNotSupportedException {
        database.remove();
        database.remove();
    }

    @Test
    public void Test_removeShouldSupportOnlyRemovingAnElementAtTheLastIndex() throws OperationNotSupportedException {
        Integer lastIndex = database.getElements()[database.getElements().length - 1];
        database.remove();

        assertNotEquals(lastIndex, database.getElements()[database.getElements().length - 1]);
    }

    @Test
    public void Test_getElementsMethodShouldReturnIntegerArray() {
        Integer[] numbers = database.getElements();
    }
}