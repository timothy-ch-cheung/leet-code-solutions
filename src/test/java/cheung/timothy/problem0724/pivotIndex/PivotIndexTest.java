package cheung.timothy.problem0724.pivotIndex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PivotIndexTest {

    private static final PivotIndex solution = new PivotIndex();

    @ParameterizedTest
    @MethodSource("testData")
    void pivotIndex(int[] nums, int expectedPivot) {
        int answer = solution.pivotIndex(nums);
        assertThat(answer, is(expectedPivot));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 7, 3, 6, 5, 6}, 3),
                Arguments.of(new int[]{1, 2, 3}, -1),
                Arguments.of(new int[]{2, 1, -1}, 0)
        );
    }
}