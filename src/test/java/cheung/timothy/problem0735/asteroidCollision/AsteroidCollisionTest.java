package cheung.timothy.problem0735.asteroidCollision;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class AsteroidCollisionTest {
    private final AsteroidCollision solution = new AsteroidCollision();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{5, 10, -5}, new int[]{5, 10}),
                Arguments.of(new int[]{8, -8}, new int[]{}),
                Arguments.of(new int[]{10, 2, -5}, new int[]{10}),
                Arguments.of(new int[]{-2,-1,1,2}, new int[]{-2,-1,1,2})
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void asteroidCollision(int[] input, int[] expected) {
        int[] answer = solution.asteroidCollision(input);
        assertThat(answer, is(expected));
    }

}