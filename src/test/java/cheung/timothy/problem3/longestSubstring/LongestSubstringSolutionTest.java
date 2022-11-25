package cheung.timothy.problem3.longestSubstring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class LongestSubstringSolutionTest {

    private static final LongestSubstringSolution solution = new LongestSubstringSolution();

    @ParameterizedTest
    @CsvSource({
            "abcabcbb,3",
            "bbbbb,1",
            "pwwkew, 3"
    })
    void longestSubstring(String input, int expected) {
        assertThat(solution.lengthOfLongestSubstring(input), is(expected));
    }

}