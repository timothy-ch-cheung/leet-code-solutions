package cheung.timothy.problem1768.mergeStringsAlternately;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class MergeStringsAlternatelyTest {

    private static final MergeStringsAlternately solution = new MergeStringsAlternately();

    @ParameterizedTest
    @MethodSource("testData")
    void mergeStrings(String word1, String word2, String expectedWord) {
        String answer = solution.mergeAlternately(word1, word2);
        assertThat(answer, is(expectedWord));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd")
        );
    }
}