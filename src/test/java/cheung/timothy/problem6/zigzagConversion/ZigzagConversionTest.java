package cheung.timothy.problem6.zigzagConversion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ZigzagConversionTest {

    private static final ZigzagConversion solution = new ZigzagConversion();

    @ParameterizedTest
    @CsvSource({
            "PAYPALISHIRING,3,PAHNAPLSIIGYIR",
            "PAYPALISHIRING,4,PINALSIGYAHRPI",
            "A,1,A"
    })
    void convert(String input, int rows, String expected) {
        assertThat(solution.convert(input, rows), is(expected));
    }

}