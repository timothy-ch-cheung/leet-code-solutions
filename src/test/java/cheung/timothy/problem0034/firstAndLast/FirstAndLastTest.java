package cheung.timothy.problem0034.firstAndLast;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FirstAndLastTest {

    private static final FirstAndLast solution = new FirstAndLast();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{5, 7, 7, 8, 8, 10}, 8, new int[]{3, 4}),
                Arguments.of(new int[]{5, 7, 7, 8, 8, 10}, 6, new int[]{-1, -1}),
                Arguments.of(new int[]{5, 7, 7, 8, 8, 8, 8, 8, 8, 8, 10}, 8, new int[]{3, 9})
        );
    }

    @MethodSource("testData")
    @ParameterizedTest
    void firstAndLast(int[] input, int target, int[] expected) {
        assertThat(solution.searchRange(input, target), is(expected));
    }
}