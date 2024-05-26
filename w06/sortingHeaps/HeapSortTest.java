package gad.sortingHeaps;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeapSortTest {
    Result result;

    @BeforeEach
    void beforeEach() {
        result = new StudentResult();
    }

    @Test
    void sortArray() {
        int[] array = { 4, 1, 6, 7, 2, 3, 5 };
        NaryHeap.heapSort(array, 2, result);

        int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7 };
        assertArrayEquals(expectedArray, array);
    }
}
