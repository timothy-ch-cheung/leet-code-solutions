package cheung.timothy.problem0394.decodeString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DecodeStringTest {

    private final DecodeString solution = new DecodeString();

    @ParameterizedTest
    @CsvSource(value = {
            "aaa, aaa",
            "3[a], aaa",
            "3[a]2[bc], aaabcbc",
            "3[a2[c]], accaccacc",
            "2[abc]3[cd]ef, abcabccdcdcdef"
    })
    void decodeString(String input, String expected) {
        String answer = solution.decodeString(input);
        assertThat(answer, is(expected));
    }

}