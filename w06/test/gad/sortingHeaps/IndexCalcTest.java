package gad.sortingHeaps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IndexCalcTest {
    Result result;

    @BeforeEach
    void beforeEach() {
        result = new StudentResult();
    }

    @Test
    public void testGetParentIndexBinaryHeap() {
        NaryHeap binaryHeap = new NaryHeap(new int[] { 0, 1, 2, 3, 4, 5, 6 }, 2, result);
        assertEquals(0, binaryHeap.getParentIndex(1));
        assertEquals(0, binaryHeap.getParentIndex(2));
        assertEquals(1, binaryHeap.getParentIndex(3));
        assertEquals(1, binaryHeap.getParentIndex(4));
        assertEquals(2, binaryHeap.getParentIndex(5));
        assertEquals(2, binaryHeap.getParentIndex(6));
    }

    @Test
    public void testGetParentIndexTernaryHeap() {
        NaryHeap ternaryHeap = new NaryHeap(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, 3, result);
        assertEquals(0, ternaryHeap.getParentIndex(1));
        assertEquals(0, ternaryHeap.getParentIndex(2));
        assertEquals(0, ternaryHeap.getParentIndex(3));
        assertEquals(1, ternaryHeap.getParentIndex(4));
        assertEquals(1, ternaryHeap.getParentIndex(5));
        assertEquals(1, ternaryHeap.getParentIndex(6));
        assertEquals(2, ternaryHeap.getParentIndex(7));
        assertEquals(2, ternaryHeap.getParentIndex(8));
        assertEquals(2, ternaryHeap.getParentIndex(9));
        assertEquals(3, ternaryHeap.getParentIndex(10));
        assertEquals(3, ternaryHeap.getParentIndex(11));
        assertEquals(3, ternaryHeap.getParentIndex(12));
    }

    @Test
    public void testGetChildIndexBinaryHeap() {
        NaryHeap binaryHeap = new NaryHeap(new int[] { 0, 1, 2, 3, 4, 5, 6 }, 2, result);
        assertEquals(1, binaryHeap.getChildIndex(0, 0));
        assertEquals(2, binaryHeap.getChildIndex(1, 0));
        assertEquals(3, binaryHeap.getChildIndex(0, 1));
        assertEquals(4, binaryHeap.getChildIndex(1, 1));
        assertEquals(5, binaryHeap.getChildIndex(0, 2));
        assertEquals(6, binaryHeap.getChildIndex(1, 2));
    }

    @Test
    public void testGetChildIndexTernaryHeap() {
        NaryHeap ternaryHeap = new NaryHeap(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, 3, result);
        assertEquals(1, ternaryHeap.getChildIndex(0, 0));
        assertEquals(2, ternaryHeap.getChildIndex(1, 0));
        assertEquals(3, ternaryHeap.getChildIndex(2, 0));
        assertEquals(4, ternaryHeap.getChildIndex(0, 1));
        assertEquals(5, ternaryHeap.getChildIndex(1, 1));
        assertEquals(6, ternaryHeap.getChildIndex(2, 1));
        assertEquals(7, ternaryHeap.getChildIndex(0, 2));
        assertEquals(8, ternaryHeap.getChildIndex(1, 2));
        assertEquals(9, ternaryHeap.getChildIndex(2, 2));
        assertEquals(10, ternaryHeap.getChildIndex(0, 3));
        assertEquals(11, ternaryHeap.getChildIndex(1, 3));
        assertEquals(12, ternaryHeap.getChildIndex(2, 3));
    }
}
