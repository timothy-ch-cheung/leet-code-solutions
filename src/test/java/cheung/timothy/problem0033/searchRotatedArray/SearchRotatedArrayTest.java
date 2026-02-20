package cheung.timothy.problem0033.searchRotatedArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SearchRotatedArrayTest {

    private static final SearchRotatedArray solution = new SearchRotatedArray();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 4, 0),
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 5, 1),
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 6, 2),
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 7, 3),
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 0, 4),
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 1, 5),
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 2, 6),
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 3, -1)
        );
    }

    @MethodSource("testData")
    @ParameterizedTest
    void searchRotatedArray(int[] input, int target, int expected) {
        assertThat(solution.search(input, target), is(expected));
    }
}