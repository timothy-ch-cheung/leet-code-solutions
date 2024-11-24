package cheung.timothy.problem0605.canPlaceFlowers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CanPlaceFlowersTest {

    private static final CanPlaceFlowers solution = new CanPlaceFlowers();

    @ParameterizedTest
    @MethodSource("testData")
    void greatestNumberOfCandies(int[] flowerbed, int n, boolean canPlaceFlowers) {
        boolean answer = solution.canPlaceFlowers(flowerbed, n);
        assertThat(answer, is(canPlaceFlowers));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 1, true),
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 2, false),
                Arguments.of(new int[]{1, 0, 0, 0, 1, 0, 0}, 2, true),
                Arguments.of(new int[]{0}, 1, true)
        );
    }
}