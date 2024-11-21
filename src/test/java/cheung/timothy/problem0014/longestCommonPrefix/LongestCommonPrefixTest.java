package cheung.timothy.problem0014.longestCommonPrefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class LongestCommonPrefixTest {

    private static final LongestCommonPrefix solution = new LongestCommonPrefix();

    @ParameterizedTest
    @MethodSource("testData")
    void reverse(String[] input, String expected) {
        assertThat(solution.longestCommonPrefix(input), is(expected));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, "")
        );
    }
}