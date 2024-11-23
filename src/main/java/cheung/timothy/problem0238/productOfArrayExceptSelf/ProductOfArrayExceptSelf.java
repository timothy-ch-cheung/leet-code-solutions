package cheung.timothy.problem0238.productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefixProducts = new int[nums.length];
        int[] suffixProducts = new int[nums.length];

        prefixProducts[0] = nums[0];
        for (int i = 1; i < nums.length -1; i++) {
            prefixProducts[i] = prefixProducts[i-1] * nums[i];
        }
        suffixProducts[nums.length -1] = nums[nums.length -1];
        for (int i = nums.length -2; i >= 0; i--) {
            suffixProducts[i] = suffixProducts[i+1] * nums[i];
        }

        result[0] = suffixProducts[1];
        result[nums.length-1] = prefixProducts[nums.length-2];
        for (int i = 1; i < nums.length-1; i++) {
            result[i] = prefixProducts[i-1] * suffixProducts[i+1];
        }

        return result;
    }
}
