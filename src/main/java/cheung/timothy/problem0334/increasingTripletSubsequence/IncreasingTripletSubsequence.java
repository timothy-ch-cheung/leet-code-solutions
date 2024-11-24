package cheung.timothy.problem0334.increasingTripletSubsequence;

public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num: nums) {
            if (num < first) {
                first = num;
            } else if (num < second && num > first) {
                second = num;
            } else if (first < second && second < num) {
                return true;
            }
        }
        return false;
    }
}
