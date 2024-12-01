package cheung.timothy.problem2215.differenceOfTwoArrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DifferenceOfTwoArraysTest {

    private static final DifferenceOfTwoArrays solution = new DifferenceOfTwoArrays();

    @ParameterizedTest
    @MethodSource("testData")
    void findDifference(int[] nums1, int[] nums2, List<List<Integer>> expected) {
        List<List<Integer>> answer = solution.findDifference(nums1, nums2);
        assertThat(answer.size(), is(2));
        assertThat(answer.get(0), equalTo(expected.get(0)));
        assertThat(answer.get(1), equalTo(expected.get(1)));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{2, 4, 6}, List.of(List.of(1, 3), List.of(4, 6))),
                Arguments.of(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}, List.of(List.of(3), Collections.emptyList()))
        );
    }
}