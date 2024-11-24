package cheung.timothy.problem0238.productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;

        int currentProduct = 1;
        for (int i = 1; i < nums.length; i++) {
            currentProduct = currentProduct * nums[i-1];
            result[i] = currentProduct;
        }
        currentProduct = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            currentProduct = currentProduct * nums[i+1];
            result[i] = currentProduct * result[i];
        }
        return result;
    }
}
