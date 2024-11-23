package cheung.timothy.problem345.reverseVowels;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ReverseVowelsTest {

    private static final ReverseVowels solution = new ReverseVowels();

    @ParameterizedTest
    @MethodSource("testData")
    void reverseVowels(String input, String expected) {
        String answer = solution.reverseVowels(input);
        assertThat(answer, is(expected));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("IceCreAm", "AceCreIm"),
                Arguments.of("leetcode", "leotcede")
        );
    }
}