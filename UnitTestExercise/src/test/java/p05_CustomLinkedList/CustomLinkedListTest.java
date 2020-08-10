package p05_CustomLinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {
    CustomLinkedList<String> customLinkedList;

    @Before
    public void initObject() {
        this.customLinkedList = new CustomLinkedList<>();
        this.customLinkedList.add("Georgi");
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_getShouldThrowIFIndexIsLessThanZero() {
        customLinkedList.get(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_getShouldThrowIFIndexIsMoreOrEqualsTheCount() {
        customLinkedList.get(1);
    }

    @Test
    public void Test_getShouldReturnElementInTheGivenIndex() {
        String actual = customLinkedList.get(0);
        String expected = "Georgi";

        assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_setShouldThrowIFIndexIsLessThanZero() {
        customLinkedList.set(-1,"Ivan");
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_setShouldThrowIFIndexIsMoreOrEqualsTheCount() {
        customLinkedList.set(1,"Ivan");
    }

    @Test
    public void Test_setShouldSetTheElementInTheGivenIndex() {
        customLinkedList.set(0,"Ivan");
        String actual = customLinkedList.get(0);
        String expected = "Ivan";

        assertEquals(expected,actual);
    }

    @Test
    public void Test_removeAtShouldRemoveElementOfSpecificIndex() {
        this.customLinkedList.add("Peter");
        this.customLinkedList.add("Justin");

        String actual = customLinkedList.removeAt(2);
        String expected = "Justin";

        assertEquals(expected,actual);
    }

    @Test
    public void Test_removeShouldRemoveElementAndReturnIndex() {
        int actualIndex = customLinkedList.remove("Georgi");
        int expectedIndex = 0;

        assertEquals(expectedIndex,actualIndex);
    }

    @Test
    public void Test_IfRemoveMethodDoesNotFoundTheElementShouldReturnNegative() {
        int actualIndex = customLinkedList.remove("David");
        int expectedIndex = -1;

        assertEquals(expectedIndex,actualIndex);
    }

    @Test
    public void Test_IndexOFShouldReturnTheIndexOFTheElement() {
        int actualIndex = customLinkedList.indexOf("Georgi");
        int expectedIndex = 0;

        assertEquals(expectedIndex,actualIndex);
    }

    @Test
    public void Test_IndexOFShouldReturnNegativeIfDoesNotFound() {
        int actualIndex = customLinkedList.indexOf("Ivan");
        int expected = -1;

        assertEquals(expected,actualIndex);
    }

    @Test
    public void Test_ContainsShouldReturnTrueIfElementIsInTheList() {
        assertTrue(this.customLinkedList.contains("Georgi"));
    }

    @Test
    public void Test_ContainsShouldReturnFalseIfElementDoesNotExist() {
        assertFalse(this.customLinkedList.contains("Ivan"));
    }



}