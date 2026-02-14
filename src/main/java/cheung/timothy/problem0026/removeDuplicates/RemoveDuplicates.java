package cheung.timothy.problem0026.removeDuplicates;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != num) {
                nums[k] = nums[i];
                num = nums[i];
                k++;
            }
        }
        return k;
    }
}
