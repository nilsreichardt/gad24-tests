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

    // @Test
    // public void testInsertIntoTeranryHeap3() {
    //     NaryHeap ternaryHeap = new NaryHeap(new int[] { }, 3, 9, result);

    //     ternaryHeap.insert(6);
    //     ternaryHeap.insert(9);
    //     ternaryHeap.insert(8);
    //     ternaryHeap.insert(2);
    //     ternaryHeap.insert(5);
    //     ternaryHeap.insert(3);
    //     ternaryHeap.insert(7);
    //     ternaryHeap.insert(1);
    //     ternaryHeap.insert(4);

    //     int[] expectedHeap = { 9, 6, 8, 2, 5, 3, 7, 1, 4 };

    //     assertArrayEquals(expectedHeap, ternaryHeap.getHeap());
    // }
}
