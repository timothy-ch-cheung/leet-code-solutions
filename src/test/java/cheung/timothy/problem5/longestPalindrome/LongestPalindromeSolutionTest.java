package cheung.timothy.problem5.longestPalindrome;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeSolutionTest {

    private static final LongestPalindromeSolution solution = new LongestPalindromeSolution();

    @ParameterizedTest
    @MethodSource("testData")
    void longestPalindrome(String input, List<String> expected) {
        assertThat(solution.longestPalindrome(input), is(in(expected)));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("babad", Arrays.asList("bab", "aba")),
                Arguments.of("cbbd", Collections.singletonList("bb"))
        );
    }
}