package cheung.timothy.problem7.reverseInteger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ReverseIntegerTest {

    private static final ReverseInteger solution = new ReverseInteger();

    @ParameterizedTest
    @CsvSource({
            "123,321",
            "-123,-321",
            "120,21",
            "-2147483648, 0",
            "2147483647, 0"
    })
    void reverse(int input, int expected) {
        assertThat(solution.reverse(input), is(expected));
    }

}