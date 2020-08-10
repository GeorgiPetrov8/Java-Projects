package p04_BubbleSortTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleTest {

    @Test
    public void Test_IfSortWorkProperly() {
        int[] numbers = {1,5,3,4};
        Bubble.sort(numbers);
        int[] expected = {1,3,4,5};
        assertArrayEquals(expected,numbers);
    }

}