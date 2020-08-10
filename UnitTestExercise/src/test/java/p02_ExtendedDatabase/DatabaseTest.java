package p02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {
    Database database;

    @Before
    public void intiDataBase() throws OperationNotSupportedException {
        this.database = new Database(new Person(1,"ivan"),
                new Person(2,"Mario"));
    }

    @Test(expected = OperationNotSupportedException.class)
    public void Test_IfTheSizeIsNot16ShouldThrowException() throws OperationNotSupportedException {
        Database database = new Database();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void Test_ifPassedElementIsNullShouldTrowException() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void Test_addShouldAddAnPersonAtTheNextFreeCell() throws OperationNotSupportedException {
        Person actual = new Person(3,"Viki");
        database.add(actual);

        Person expected = database.getElements()[database.getElements().length - 1];

        assertEquals(expected, actual);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void Test_removingPersonFromEmptyDataBaseShouldThrowException() throws OperationNotSupportedException {
        database.remove();
        database.remove();
        database.remove();
    }

    @Test
    public void Test_removeShouldSupportOnlyRemovingAnPersonAtTheLastIndex() throws OperationNotSupportedException {
        Person actual = database.getElements()[database.getElements().length - 1];
        database.remove();
        Person expected =database.getElements()[database.getElements().length - 1];

        assertNotEquals(expected,actual);
    }

    @Test
    public void Test_getElementsMethodShouldReturnPersonArray() {
        Person[] people = database.getElements();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void Test_IfThereIsNoUserWithThisNameShouldTrowException() throws OperationNotSupportedException {
        this.database.findByUsername("Jordan");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void Test_IfUsernameIsNullShouldThrowException() throws OperationNotSupportedException {
        this.database.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void Test_IfNoUserIsPresentByThisIdShouldTrowException() throws OperationNotSupportedException {
        this.database.findById(4);
    }

}