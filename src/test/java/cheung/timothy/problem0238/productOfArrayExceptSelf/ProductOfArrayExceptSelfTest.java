package cheung.timothy.problem0238.productOfArrayExceptSelf;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class ProductOfArrayExceptSelfTest {

    private static final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();

    @ParameterizedTest
    @MethodSource("testData")
    void productOfArrayExceptSelf(int[] input, int[] expected) {
        int[] answer = solution.productExceptSelf(input);
        assertThat(answer, equalTo(expected));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}),
                Arguments.of(new int[]{-1, 1, 0, - 3, 3}, new int[]{0, 0, 9, 0, 0})
        );
    }
}