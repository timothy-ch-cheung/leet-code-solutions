package cheung.timothy.problem1071.greatestCommonDivisorString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class GreatestCommonDivisorStringTest {

    private static GreatestCommonDivisorString solution = new GreatestCommonDivisorString();

    @ParameterizedTest
    @MethodSource("testData")
    void gcdOfStrings(String str1, String str2, String expectedDivisor) {
        String actual = solution.gcdOfStrings(str1, str2);
        assertThat(actual, is(expectedDivisor));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("ABCABC", "ABC", "ABC"),
                Arguments.of("ABABAB", "ABAB", "AB"),
                Arguments.of("LEET", "CODE", "")
        );
    }
}