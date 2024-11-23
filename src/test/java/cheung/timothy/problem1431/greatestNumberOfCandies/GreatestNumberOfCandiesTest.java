package cheung.timothy.problem1431.greatestNumberOfCandies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

class GreatestNumberOfCandiesTest {

    private static final GreatestNumberOfCandies solution = new GreatestNumberOfCandies();

    @ParameterizedTest
    @MethodSource("testData")
    void greatestNumberOfCandies(int[] candies, int extraCandies, List<Boolean> expectedCandies) {
        List<Boolean> answer = solution.kidsWithCandies(candies, extraCandies);
        assertThat(answer, is(expectedCandies));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 5, 1, 3}, 3, Arrays.asList(true, true, true, false, true)),
                Arguments.of(new int[]{4, 2, 1, 1, 2}, 1, Arrays.asList(true, false, false, false, false)),
                Arguments.of(new int[]{12, 1, 12}, 10, Arrays.asList(true, false, true))
        );
    }
}