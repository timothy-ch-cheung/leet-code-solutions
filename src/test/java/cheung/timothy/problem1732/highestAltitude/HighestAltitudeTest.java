package cheung.timothy.problem1732.highestAltitude;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class HighestAltitudeTest {

    private static final HighestAltitude solution = new HighestAltitude();

    @ParameterizedTest
    @MethodSource("testData")
    void largestAltitude(int[] gain, int expectedAltitude) {
        int answer = solution.largestAltitude(gain);
        assertThat(answer, is(expectedAltitude));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{-5, 1, 5, 0, -7}, 1),
                Arguments.of(new int[]{-4, -3, -2, -1, 4, 3, 2}, 0)
        );
    }
}