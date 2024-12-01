package cheung.timothy.problem1207.uniqueNumOfOccurrences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class UniqueNumOfOccurrencesTest {

    private static final UniqueNumOfOccurrences solution = new UniqueNumOfOccurrences();

    @ParameterizedTest
    @MethodSource("testData")
    void uniqueOccurrences(int[] input, boolean expectedUnique) {
        boolean answer = solution.uniqueOccurrences(input);
        assertThat(answer, is(expectedUnique));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 1, 1, 3}, true),
                Arguments.of(new int[]{1, 2}, false)
        );
    }
}