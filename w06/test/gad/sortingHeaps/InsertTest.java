package gad.sortingHeaps;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InsertTest {
    Result result;

    @BeforeEach
    void beforeEach() {
        result = new StudentResult();
    }

    @Test
    public void testConstructorBinary() {
        NaryHeap binaryHeap = new NaryHeap(new int[] { 4, 1, 6, 7, 2, 3, 5 }, 2, 7, result);

        int[] expectedHeap = { 7, 4, 6, 1, 2, 3, 5 };
        assertArrayEquals(expectedHeap, binaryHeap.getHeap());
    }

    @Test
    public void testInsertIntoBinaryHeap2() {
        NaryHeap binaryHeap = new NaryHeap(new int[] { 4, 1, 6, 7, 2, 3, 5 }, 2, 15, result);

        binaryHeap.insert(8);
        binaryHeap.insert(3);
        binaryHeap.insert(9);
        binaryHeap.insert(0);
        binaryHeap.insert(6);

        int[] expectedHeap = { 9, 8, 6, 4, 7, 6, 5, 1, 3, 2, 0, 3, 0, 0, 0 };

        assertArrayEquals(expectedHeap, binaryHeap.getHeap());
    }
}
