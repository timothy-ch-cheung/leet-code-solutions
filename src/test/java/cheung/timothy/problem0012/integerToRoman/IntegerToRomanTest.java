package cheung.timothy.problem0012.integerToRoman;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class IntegerToRomanTest {

    private final IntegerToRoman solution = new IntegerToRoman();

    @ParameterizedTest
    @MethodSource("testData")
    void maxArea(int input, String expected) {
        assertThat(solution.intToRoman(input), is(expected));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(3749, "MMMDCCXLIX"),
                Arguments.of(58, "LVIII")
        );
    }

}