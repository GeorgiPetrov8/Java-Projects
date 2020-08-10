package p03_IteratorTest;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class ListIteratorTest {
    ListIterator listIterator;

    @Before
    public void initObject() throws OperationNotSupportedException {
        this.listIterator = new ListIterator("Ivan","Andrey","Peter","George");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void Test_constructorShouldThrowExceptionIfParamsAreNull() throws OperationNotSupportedException {
        this.listIterator = new ListIterator( null);
    }

    @Test
    public void Test_constructorShouldCreateListOfStrings() throws OperationNotSupportedException {
      moveIndex();
    }

    @Test
    public void Test_moveMethodShouldReturnTrueIfWorkProperty() {
        assertTrue(listIterator.move());
    }

    @Test
    public void Test_moveMethodShouldReturnFalseIfThereIsNotNextIndex() throws OperationNotSupportedException {
        this.listIterator = new ListIterator("Ivan");
        assertFalse(listIterator.move());
    }

    @Test
    public void Test_hasNextShouldReturnTrueIfThereIsNextIndex() {
        boolean actual = this.listIterator.hasNext();
        assertTrue(actual);
    }

    @Test
    public void Test_hasNextShouldReturnFalseIfThereIsNoNextIndex() throws OperationNotSupportedException {
        this.listIterator = new ListIterator("David");
        assertFalse(this.listIterator.hasNext());
    }

    @Test(expected = IllegalStateException.class)
    public void Test_printShouldThrowExceptionIfTheListIsEmpty() throws OperationNotSupportedException {
        this.listIterator = new ListIterator();

        listIterator.print();
    }

    @Test
    public void Test_printShouldReturnStringInTheCurrentIndex() {
        moveIndex();

        assertEquals("George", this.listIterator.print());

    }

    public void moveIndex() {
        assertTrue(listIterator.move());
        assertTrue(listIterator.move());
        assertTrue(listIterator.move());
        assertFalse(listIterator.move());
    }

}