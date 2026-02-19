package cheung.timothy.problem0034.firstAndLast;

public class FirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{searchLowest(nums, target), searchHighest(nums, target)};
    }

    private int searchLowest(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target && (mid == 0 || nums[mid - 1] < target)) {
                return mid;
            } else if (nums[mid] == target || nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private int searchHighest(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] > target)) {
                return mid;
            } else if (nums[mid] == target || nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
