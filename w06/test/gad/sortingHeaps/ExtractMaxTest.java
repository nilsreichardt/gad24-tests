package gad.sortingHeaps;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Random;
import java.util.PriorityQueue;

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

    @Test
    void testExtractMaxBinaryBigTest() {
        int[] values = new int[100_000];
        Random random = new Random(42);

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt();
        }

        NaryHeap binaryHeap = new NaryHeap(values, 2, values.length, result);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(java.util.Collections.reverseOrder());

        for (int i = 0; i < values.length; i++) {
            priorityQueue.add(values[i]);
        }

        for (int i = 0; i < values.length; i++) {
            int expected = priorityQueue.poll();
            int actual = binaryHeap.extractMax();
            assertEquals(expected, actual, "Extracted max elements differ at index " + i);
        }
    }

    @Test
    void testExtractMaxTernaryBigTest() {
        int[] values = new int[100_000];
        Random random = new Random(42);

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt();
        }

        NaryHeap ternaryHeap = new NaryHeap(values, 3, values.length, result);
        PriorityQueue<Integer> javaHeap = new PriorityQueue<>(java.util.Collections.reverseOrder());
        for (int value : values) {
            javaHeap.add(value);
        }

        for (int i = 0; i < values.length; i++) {
            int expectedMax = javaHeap.poll();
            int actualMax = ternaryHeap.extractMax();
            assertEquals(expectedMax, actualMax, "Extracted max elements differ at index " + i);
        }
    }
}
