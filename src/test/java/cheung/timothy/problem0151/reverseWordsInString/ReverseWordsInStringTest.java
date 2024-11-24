package cheung.timothy.problem0151.reverseWordsInString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ReverseWordsInStringTest {

    private static final ReverseWordsInString solution = new ReverseWordsInString();

    @ParameterizedTest
    @MethodSource("testData")
    void reverseWordsInString(String input, String expected) {
        String answer = solution.reverseWords(input);
        assertThat(answer, is(expected));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("the sky is blue", "blue is sky the"),
                Arguments.of("  hello world  ", "world hello"),
                Arguments.of("a good   example", "example good a"),
                Arguments.of("a", "a")
        );
    }
}