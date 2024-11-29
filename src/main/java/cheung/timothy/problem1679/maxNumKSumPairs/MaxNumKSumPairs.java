package cheung.timothy.problem1679.maxNumKSumPairs;

import java.util.Arrays;

public class MaxNumKSumPairs {

    public int maxOperations(int[] nums, int k) {
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        int sum;
        Arrays.sort(nums);
        while (right > left) {
            sum = nums[left] + nums[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
