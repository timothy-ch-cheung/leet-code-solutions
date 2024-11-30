package cheung.timothy.problem1004.maxConsecutiveOnesIII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MaxConsecutiveOnesIIITest {

    private static final MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();

    @ParameterizedTest
    @MethodSource("testData")
    void longestOnes(int[] input, int k, int expectedOnes) {
        int maxOnes = solution.longestOnes(input, k);
        assertThat(maxOnes, is(expectedOnes));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2, 6),
                Arguments.of(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3, 10)
        );
    }
}