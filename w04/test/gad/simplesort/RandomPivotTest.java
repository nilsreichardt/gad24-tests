package gad.simplesort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RandomPivotTest {

    private static Stream<Arguments> randomPivotTest() {
        return Stream.of(
                Arguments.of(
                        new int[]{0, 1, 2, 3, 4},
                        0,
                        4,
                        0
                ),
                Arguments.of(
                        new int[]{0, 1, 2, 3},
                        0,
                        3,
                        1
                ),
                Arguments.of(
                        new int[]{0, 1, 2, 3},
                        1,
                        3,
                        3
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    public void randomPivotTest(int[] numbers, int from, int to, int expected) {
        int actual = PivotFinder.getRandomPivot(42).findPivot(numbers, from, to);
        assertEquals(expected, actual);
    }
}
