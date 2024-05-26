package gad.sortingHeaps;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeTest {
    Result result;

    @BeforeEach
    void beforeEach() {
        result = new StudentResult();
    }

    @Test
    void testMerge() {
        NaryHeap binaryHeap1 = new NaryHeap(new int[] { 4, 1, 6, 7, 2, 3, 5 }, 2, 15, result);
        NaryHeap binaryHeap2 = new NaryHeap(new int[] { 7, 4, 10, 6, 9, 5, 8 }, 2, 7, result);

        binaryHeap1.merge(binaryHeap2);

        // Please note that there are multiple correct answers for this test
        // case. This is the one from Artemis.
        int[] expectedHeap = { 10, 9, 7, 7, 8, 5, 6, 1, 4, 2, 6, 4, 3, 5, 0 };
        assertArrayEquals(expectedHeap, binaryHeap1.getHeap());
    }
}
