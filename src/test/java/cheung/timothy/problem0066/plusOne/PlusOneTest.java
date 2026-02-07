package cheung.timothy.problem0066.plusOne;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PlusOneTest {

    private final PlusOne solution = new PlusOne();

    @MethodSource("testData")
    @ParameterizedTest
    void plusOne(int[] input, int[] expected) {
        assertThat(solution.plusOne(input), is(expected));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, new int[]{1, 3}),
                Arguments.of(new int[]{9}, new int[]{1, 0}),
                Arguments.of(new int[]{4, 3, 2, 1}, new int[]{4, 3, 2, 2})
        );
    }
}