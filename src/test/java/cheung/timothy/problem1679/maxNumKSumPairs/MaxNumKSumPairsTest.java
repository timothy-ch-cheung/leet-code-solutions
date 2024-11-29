package cheung.timothy.problem1679.maxNumKSumPairs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MaxNumKSumPairsTest {

    private static final MaxNumKSumPairs solution = new MaxNumKSumPairs();

    @ParameterizedTest
    @MethodSource("testData")
    void moveZeroes(int[] input, int k, int expectedOperations) {
        int operations = solution.maxOperations(input, k);
        assertThat(operations, is(expectedOperations));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 5, 2),
                Arguments.of(new int[]{3, 1, 3, 4, 3}, 5, 1),
                Arguments.of(new int[]{1}, 5, 0),
                Arguments.of(new int[]{}, 5, 0)
        );
    }
}