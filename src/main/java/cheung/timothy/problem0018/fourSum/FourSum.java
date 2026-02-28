package cheung.timothy.problem0018.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i+1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int k = j + 1;
                int l = nums.length - 1;
                long subSum = nums[i] + nums[j];
                long subTarget = target - subSum;
                while (k < l) {
                    long subSubSum = nums[k] + nums[l];
                    if (subSubSum == subTarget) {
                        result.add(List.of(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k-1]) {
                            k++;
                        }
                        while (k < l && nums[l] == nums[l+1]) {
                            l--;
                        }
                    } else if (subSubSum < subTarget) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return result;
    }
}
