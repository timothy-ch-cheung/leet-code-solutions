package cheung.timothy.problem8.stringToInteger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class StringToIntegerTest {

    private final static StringToInteger solution = new StringToInteger();

    @ParameterizedTest
    @CsvSource({
            "42,42",
            "-42,-42",
            "4193 with words,4193"
    })
    void stringToInteger(String input, int expected) {
        assertThat(solution.myAtoi(input), is(expected));
    }

}