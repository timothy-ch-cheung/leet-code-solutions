package cheung.timothy.problem0039.combinationSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class CombinationSumTest {

    private static final CombinationSum solution = new CombinationSum();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{2,3,6,7}, 7, List.of(List.of(2,2,3), List.of(7)))
        );
    }

    @MethodSource("testData")
    @ParameterizedTest
    void combinationSum(int[] input, int target, List<List<Integer>> expected) {
        assertThat(solution.combinationSum(input, target), is(expected));
    }

}