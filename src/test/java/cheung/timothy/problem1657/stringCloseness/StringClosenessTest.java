package cheung.timothy.problem1657.stringCloseness;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StringClosenessTest {

    private static final StringCloseness solution = new StringCloseness();

    @ParameterizedTest
    @MethodSource("testData")
    void closeStrings(String word1, String word2, boolean isClose) {
        boolean answer = solution.closeStrings(word1, word2);
        assertThat(answer, is(isClose));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("abc", "bca", true),
                Arguments.of("a", "aa", false),
                Arguments.of("cabbba", "abbccc", true)
        );
    }
}