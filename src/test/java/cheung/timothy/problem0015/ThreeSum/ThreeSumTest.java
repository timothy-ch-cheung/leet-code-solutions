package cheung.timothy.problem0015.ThreeSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.*;
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
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, asList(asList(-1, -1, 2), asList(-1, 0, 1))),
                Arguments.of(new int[]{0, 1, 1}, new ArrayList<Integer>()),
                Arguments.of(new int[]{0, 0, 0}, Collections.singletonList(asList(0, 0, 0))),
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4}, asList(asList(-4, 0, 4),asList(-4, 1, 3),asList(-3, -1, 4),asList(-3, 0, 3),asList(-3, 0, 3),asList(-2, -1, 3),asList(-2, 0, 2),asList(-1, -1, 2),asList(-1, 0, 1)))
        );
    }

}