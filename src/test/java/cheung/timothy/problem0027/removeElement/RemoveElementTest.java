package cheung.timothy.problem0027.removeElement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RemoveElementTest {

    private static final RemoveElement solution = new RemoveElement();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 4}, 2, new int[]{1, 4}, 2),
                Arguments.of(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2}, 2)
        );
    }

    @MethodSource("testData")
    @ParameterizedTest
    void removeElement(int[] input, int remove, int[] expected, int expectedK) {
        int k = solution.removeElement(input, remove);
        assertThat(k, is(expectedK));
        for (int i = 0; i < k; i++) {
            assertThat(input[i], is(expected[i]));
        }
    }

}