package cheung.timothy.problem0392.isSubsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class IsSubsequenceTest {

    private static final IsSubsequence solution = new IsSubsequence();

    @ParameterizedTest
    @MethodSource("testData")
    void moveZeroes(String s, String t, boolean expected) {
        boolean isSubsequence = solution.isSubsequence(s, t);
        assertThat(isSubsequence, is(expected));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false),
                Arguments.of("oat", "float", true)
        );
    }
}