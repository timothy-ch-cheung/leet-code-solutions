package cheung.timothy.problem0015.ThreeSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ThreeSumTest {

    private static final ThreeSum solution = new ThreeSum();

    @ParameterizedTest
    @MethodSource("testData")
    void sum(int[] input, List<List<Integer>> expected) {
        List<List<Integer>> answer = solution.threeSum(input);
        assertNotNull(answer);
        assertThat(answer.size(), is(expected.size()));
        for (List<Integer> triplet : expected) {
            assertThat(answer, hasItem(triplet));
        }
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, Arrays.asList(Arrays.asList(-1, 2, -1), Arrays.asList(-1, 0, 1))),
                Arguments.of(new int[]{0, 1, 1}, new ArrayList<Integer>()),
                Arguments.of(new int[]{0, 0, 0}, Collections.singletonList(Arrays.asList(0, 0, 0)))
        );
    }

}