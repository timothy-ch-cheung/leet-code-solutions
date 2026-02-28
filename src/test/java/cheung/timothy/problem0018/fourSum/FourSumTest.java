package cheung.timothy.problem0018.fourSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FourSumTest {
    private static final FourSum solution = new FourSum();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1,0,-1,0,-2,2}, 0, List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1))),
                Arguments.of(new int[]{2,2,2,2,2}, 8, List.of(List.of(2,2,2,2)))
        );
    }

    @MethodSource("testData")
    @ParameterizedTest
    void shouldFindFourSum(int[] input, int target, List<List<Integer>> expected) {
        assertThat(solution.fourSum(input, target), is(expected));
    }
}