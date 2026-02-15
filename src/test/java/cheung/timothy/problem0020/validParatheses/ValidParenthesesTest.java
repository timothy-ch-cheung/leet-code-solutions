package cheung.timothy.problem0020.validParatheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ValidParenthesesTest {

    private static final ValidParentheses solution = new ValidParentheses();

    @CsvSource(value = {
            "((, false",
            "(){}[], true",
            "({}), true",
            "([], false",
    })
    @ParameterizedTest
    void validParentheses(String input, boolean expected) {
        assertThat(solution.isValid(input), is(expected));
    }
}