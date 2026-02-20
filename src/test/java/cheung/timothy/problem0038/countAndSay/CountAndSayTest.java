package cheung.timothy.problem0038.countAndSay;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.in;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {

    private static final CountAndSay solution = new CountAndSay();

    @CsvSource({
            "1, 1",
            "2, 11",
            "3, 21"
    })
    @ParameterizedTest
    void countAndSay(int input, String expected) {
        assertThat(solution.countAndSay(input), is(expected));
    }
}