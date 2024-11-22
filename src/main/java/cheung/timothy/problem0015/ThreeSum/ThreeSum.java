package cheung.timothy.problem0015.ThreeSum;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> results = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int k = nums.length - 1;
            int j = i + 1;
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (total == 0) {
                    results.add(List.of(nums[i], nums[j], nums[k]));
                }

                if (total < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(results);
    }
}