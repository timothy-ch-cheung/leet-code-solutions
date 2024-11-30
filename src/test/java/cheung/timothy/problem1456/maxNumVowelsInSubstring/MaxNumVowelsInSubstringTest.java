package cheung.timothy.problem1456.maxNumVowelsInSubstring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MaxNumVowelsInSubstringTest {

    private static final MaxNumVowelsInSubstring solution = new MaxNumVowelsInSubstring();

    @ParameterizedTest
    @MethodSource("testData")
    void maxVowels(String input, int k, int expectedVowels) {
        int answer = solution.maxVowels(input, k);
        assertThat(answer, is(expectedVowels));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("abciiidef", 3, 3),
                Arguments.of("aeiou", 2, 2),
                Arguments.of("leetcode", 3, 2)
        );
    }
}