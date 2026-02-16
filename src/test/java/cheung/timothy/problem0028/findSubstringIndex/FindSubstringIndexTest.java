package cheung.timothy.problem0028.findSubstringIndex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FindSubstringIndexTest {

    private static final FindSubstringIndex solution = new FindSubstringIndex();

    @CsvSource({
            "tetest, test, 2",
            "strawberry, berry, 5"
    })
    @ParameterizedTest
    void findSubstringIndex(String haystack, String needle, int index) {
        assertThat(solution.strStr(haystack, needle), is(index));
    }
}