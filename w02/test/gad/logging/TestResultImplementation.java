package gad.logging;

import gad.binarysearch.Result;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TestResultImplementation implements Result {

    private final int[] steps;
    private int index;

    public TestResultImplementation(int[][] possibleSolutions) {
        this(Arrays.stream(possibleSolutions)
                .mapToInt(s -> s.length)
                .max().orElse(0));
    }
    public TestResultImplementation(int expectedSize) {
        steps = new int[expectedSize];
    }

    @Override
    public void addStep(int step) {
        System.out.println("added step to index " + step);
        if (index < steps.length) {
            steps[index] = step;
        }
        index++;
    }

    public void testLogging(int[] solution) {
        assertEquals(solution.length, index, "Number of logged steps wrong");

        assertArrayEquals(solution, steps, "Logged wrong path");
    }

    public void testLogging(int[][] possibleSolutions) {
        testLogging(possibleSolutions, "");
    }
    public void testLogging(int[][] possibleSolutions, String messagePrefix) {
        assertTrue(Arrays.stream(possibleSolutions).anyMatch(
                        solution -> index == solution.length && testArrayEquals(solution, steps)
                ),
                messagePrefix + "steps did not match any valid solution (possibilities are: " +
                        Arrays.stream(possibleSolutions)
                                .map(Arrays::toString)
                                .collect(Collectors.joining(" or ")) +
                        ")");
    }

    /**
     * assumes arrays have same length
     * @param a first array
     * @param b second array
     * @return whether array a and b are equal
     */
    private boolean testArrayEquals(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

}