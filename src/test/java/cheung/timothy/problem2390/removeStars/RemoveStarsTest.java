package cheung.timothy.problem2390.removeStars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RemoveStarsTest {

    private final RemoveStars solution = new RemoveStars();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("leet**cod*e", "lecoe"),
                Arguments.of("erase*****", "")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void removeStars(String input, String expected) {
        String answer = solution.removeStars(input);
        assertThat(answer, is(expected));
    }

}