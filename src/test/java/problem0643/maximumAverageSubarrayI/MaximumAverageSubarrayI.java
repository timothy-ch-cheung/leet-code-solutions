package problem0643.maximumAverageSubarrayI;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int maxTotal = 0;
        for (int i = 0; i < k; i++) {
            maxTotal += nums[i];
        }
        int currentTotal = maxTotal;
        for (int i = k; i < nums.length; i++) {
            currentTotal = currentTotal - nums[i-k] + nums[i];
            if (currentTotal > maxTotal) {
                maxTotal = currentTotal;
            }
        }
        return (double) maxTotal / k;
    }
}
