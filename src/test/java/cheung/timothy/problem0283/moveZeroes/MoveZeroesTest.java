package cheung.timothy.problem0283.moveZeroes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class MoveZeroesTest {

    private static final MoveZeroes solution = new MoveZeroes();

    @ParameterizedTest
    @MethodSource("testData")
    void moveZeroes(int[] input, int[] expected) {
        solution.moveZeroes(input);
        assertThat(input, equalTo(expected));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{1, 0}, new int[]{1, 0}),
                Arguments.of(new int[]{2, 1}, new int[]{2, 1}),
                Arguments.of(new int[]{1, 0, 1}, new int[]{1, 1, 0})
        );
    }
}