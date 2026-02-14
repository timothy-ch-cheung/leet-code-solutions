package cheung.timothy.problem0026.removeDuplicates;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RemoveDuplicatesTest {

    private static final RemoveDuplicates solution = new RemoveDuplicates();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 2),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5)
        );
    }

    @MethodSource("testData")
    @ParameterizedTest
    void removeDuplicates(int[] input, int expected) {
        assertThat(solution.removeDuplicates(input), is(expected));
    }

}