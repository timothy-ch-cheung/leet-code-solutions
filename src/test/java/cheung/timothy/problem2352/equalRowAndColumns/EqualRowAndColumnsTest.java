package cheung.timothy.problem2352.equalRowAndColumns;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class EqualRowAndColumnsTest {

    private static final EqualRowAndColumns solution = new EqualRowAndColumns();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[][]{
                        new int[]{3, 2, 1},
                        new int[]{1, 7, 6},
                        new int[]{2, 7, 7}
                }, 1),
                Arguments.of(new int[][]{
                        new int[]{3, 1, 2, 2},
                        new int[]{1, 4, 4, 5},
                        new int[]{2, 4, 2, 2},
                        new int[]{2, 4, 2, 2}
                }, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void equalPairs(int[][] grid, int expectedPairs) {
        int answer = solution.equalPairs(grid);
        assertThat(answer, is(expectedPairs));
    }
}