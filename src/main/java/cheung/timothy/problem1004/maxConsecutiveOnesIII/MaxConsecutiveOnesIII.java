package cheung.timothy.problem1004.maxConsecutiveOnesIII;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int maxOnes = 0;
        int currentK = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (currentK < k && nums[right] == 0) {
                currentK++;
            } else if (nums[right] == 0) {
                while (nums[left] != 0) {
                    left++;
                }
                left++;
            }

            int total = right - left + 1;
            if (total > maxOnes) {
                maxOnes = total;
            }
        }
        return maxOnes;
    }
}
