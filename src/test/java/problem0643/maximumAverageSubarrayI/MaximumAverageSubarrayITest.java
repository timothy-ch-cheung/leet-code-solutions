package problem0643.maximumAverageSubarrayI;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayITest {

    private static final double PRECISION = 0.00001;
    private static final MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();

    @ParameterizedTest
    @MethodSource("testData")
    void findMaxAverage(int[] input, int k, double expected) {
        double answer = solution.findMaxAverage(input, k);
        assertThat(answer, closeTo(expected, PRECISION));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1,12,-5,-6,50,3}, 4, 12.75),
                Arguments.of(new int[]{5}, 1, 5),
                Arguments.of(new int[]{6,2}, 1, 6)
        );
    }
}