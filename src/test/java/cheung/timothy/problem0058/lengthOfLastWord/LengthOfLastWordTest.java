package cheung.timothy.problem0058.lengthOfLastWord;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class LengthOfLastWordTest {

    private static final LengthOfLastWord solution = new LengthOfLastWord();

    @CsvSource(value = {
            "'Hello World', 5",
            "'     My name is tester   ', 6"
    })
    @ParameterizedTest
    void testLengthOfLastWord(String input, int expected) {
        assertThat(solution.lengthOfLastWord(input), is(expected));
    }
}