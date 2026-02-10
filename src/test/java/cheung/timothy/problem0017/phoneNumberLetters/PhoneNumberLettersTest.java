package cheung.timothy.problem0017.phoneNumberLetters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PhoneNumberLettersTest {
    private static final PhoneNumberLetters solution = new PhoneNumberLetters();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("23", Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")),
                Arguments.of("2", Arrays.asList("a", "b", "c"))
        );
    }

    @MethodSource("testData")
    @ParameterizedTest
    void testPhoneNumberLetters(String digits, List<String> expected) {
        assertThat(solution.letterCombinations(digits), is(expected));
    }
}