package cheung.timothy.problem2215.differenceOfTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> num1Set = new HashSet<>();
        for (int num : nums1) {
            num1Set.add(num);
        }
        Set<Integer> num2Set = new HashSet<>();
        for (int num : nums2) {
            num2Set.add(num);
        }

        Set<Integer> answer1 = new HashSet<>();
        for (int num : nums1) {
            if (!num2Set.contains(num)) {
                answer1.add(num);
            }
        }
        Set<Integer> answer2 = new HashSet<>();
        for (int num : nums2) {
            if (!num1Set.contains(num)) {
                answer2.add(num);
            }
        }

        return List.of(new ArrayList<>(answer1), new ArrayList<>(answer2));
    }
}
