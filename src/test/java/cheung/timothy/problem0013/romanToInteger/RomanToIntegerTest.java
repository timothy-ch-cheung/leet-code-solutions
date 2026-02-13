package cheung.timothy.problem0013.romanToInteger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RomanToIntegerTest {

    private final RomanToInteger solution = new RomanToInteger();

    @CsvSource(value = {
            "XIV, 14",
            "X, 10"
    })
    @ParameterizedTest
    void romanToInteger(String input, int output) {
        assertThat(solution.romanToInt(input), is(output));
    }
}