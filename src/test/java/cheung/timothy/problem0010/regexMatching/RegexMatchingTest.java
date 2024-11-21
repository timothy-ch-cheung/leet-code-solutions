package cheung.timothy.problem0010.regexMatching;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RegexMatchingTest {

    private static final RegexMatching solution = new RegexMatching();

    @ParameterizedTest
    @CsvSource({
            "aa, a, false",
            "aa, a*, true",
            "ab, .*, true",
            "abcdefgh, abc.*gh, true",
            "abcdefghgh, abc.*gh, true",
            "abcdefgha, abc.*gh, false"
    })
    void match(String input, String regex, boolean expected) {
        assertThat(solution.isMatch(input, regex), is(expected));
    }

}