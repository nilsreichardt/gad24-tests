package gad.sortingHeaps;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExtractMaxTest {
    Result result;

    @BeforeEach
    void beforeEach() {
        result = new StudentResult();
    }

    @Test
    void testExtractMaxBinary() {
        NaryHeap binaryHeap = new NaryHeap(new int[] { 4, 1, 6, 7, 2, 3, 5 }, 2, 7, result);

        binaryHeap.extractMax();
        int[] expectedHeapAfter7 = { 6, 4, 5, 1, 2, 3, 7 };
        assertArrayEquals(expectedHeapAfter7, binaryHeap.getHeap());

        binaryHeap.extractMax();
        int[] expectedHeapAfter6 = { 5, 4, 3, 1, 2, 6, 7 };
        assertArrayEquals(expectedHeapAfter6, binaryHeap.getHeap());

        binaryHeap.extractMax();
        int[] expectedHeapAfter5 = { 4, 2, 3, 1, 5, 6, 7 };
        assertArrayEquals(expectedHeapAfter5, binaryHeap.getHeap());

        binaryHeap.extractMax();
        int[] expectedHeapAfter4 = { 3, 2, 1, 4, 5, 6, 7 };
        assertArrayEquals(expectedHeapAfter4, binaryHeap.getHeap());

        binaryHeap.extractMax();
        int[] expectedHeapAfter3 = { 2, 1, 3, 4, 5, 6, 7 };
        assertArrayEquals(expectedHeapAfter3, binaryHeap.getHeap());

        binaryHeap.extractMax();
        int[] expectedHeapAfter2 = { 1, 2, 3, 4, 5, 6, 7 };
        assertArrayEquals(expectedHeapAfter2, binaryHeap.getHeap());

        binaryHeap.extractMax();
        int[] expectedHeapAfter1 = { 1, 2, 3, 4, 5, 6, 7 };
        assertArrayEquals(expectedHeapAfter1, binaryHeap.getHeap());
    }

    @Test
    void testSingleElementHeap() {
        NaryHeap binaryHeap = new NaryHeap(new int[] { 1 }, 2, 1, result);

        binaryHeap.extractMax();
        int[] expectedHeapAfterEmpty = { 1 };
        assertArrayEquals(expectedHeapAfterEmpty, binaryHeap.getHeap());
    }
}
