package cheung.timothy.problem0334.increasingTripletSubsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class IncreasingTripletSubsequenceTest {

    private static final IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();

    @ParameterizedTest
    @MethodSource("testData")
    void productOfArrayExceptSelf(int[] input, boolean expected) {
        boolean answer = solution.increasingTriplet(input);
        assertThat(answer, is(expected));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, true),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, false),
                Arguments.of(new int[]{2, 1, 5, 0, 4, 6}, true)
        );
    }
}