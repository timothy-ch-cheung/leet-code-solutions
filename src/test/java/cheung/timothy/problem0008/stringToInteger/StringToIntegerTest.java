package cheung.timothy.problem0008.stringToInteger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class StringToIntegerTest {

    private final static StringToInteger solution = new StringToInteger();

    @ParameterizedTest
    @MethodSource("testData")
    void stringToInteger(String input, int expected) {
        assertThat(solution.myAtoi(input), is(expected));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of("-42", -42),
                Arguments.of("4193 with words,4193", 4193),
                Arguments.of("", 0),
                Arguments.of(" ", 0),
                Arguments.of("-2147483649", Integer.MIN_VALUE)
        );
    }

}