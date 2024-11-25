package cheung.timothy.problem0443.stringCompression;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StringCompressionTest {

    private static final StringCompression solution = new StringCompression();

    @ParameterizedTest
    @MethodSource("testData")
    void compressString(char[] input, int expected) {
        int answer = solution.compress(input);
        assertThat(answer, is(expected));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}, 6),
                Arguments.of(new char[]{'a'}, 1),
                Arguments.of(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}, 4),
                Arguments.of(new char[]{'a', 'a', 'b'}, 3)
        );
    }
}