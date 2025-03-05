package cheung.timothy.problem0547.numberOfProvinces;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class NumberOfProvincesTest {

    private NumberOfProvinces solution = new NumberOfProvinces();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[][]{new int[]{1, 1, 0}, new int[]{1, 1, 0}, new int[]{0, 0, 1}}, 2),
                Arguments.of(new int[][]{new int[]{1, 0, 0}, new int[]{0, 1, 0}, new int[]{0, 0, 1}}, 3),
                Arguments.of(new int[][]{new int[]{1, 0, 0, 1}, new int[]{0, 1, 1, 0}, new int[]{0, 1, 1, 1}, new int[]{1, 0, 1, 1}}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void shouldFindProvinces(int[][] isConnected, int numProvinces) {
        int answer = solution.findCircleNum(isConnected);
        assertThat(answer, is(numProvinces));
    }
}