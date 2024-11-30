package cheung.timothy.problem0724.pivotIndex;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int currentTotal = 0;
        int[] leftSum = new int[nums.length];
        for (int i=0; i < nums.length; i++) {
            currentTotal += nums[i];
            leftSum[i] = currentTotal;
        }
        int[] rightSum = new int[nums.length];
        currentTotal = 0;
        for (int i=nums.length -1; i >= 0; i--) {
            currentTotal += nums[i];
            rightSum[i] = currentTotal;
        }
        int leftTotal = 0;
        int rightTotal = 0;
        for (int i=0; i < nums.length; i++) {
            leftTotal = i == 0 ? 0 : leftSum[i-1];
            rightTotal = i == nums.length -1 ? 0 : rightSum[i+1];
            if (leftTotal == rightTotal) {
                return i;
            }
        }
        return -1;
    }
}
