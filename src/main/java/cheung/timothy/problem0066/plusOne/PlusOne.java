package cheung.timothy.problem0066.plusOne;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        reverseArrayInPlace(digits);
        boolean carry = true;
        for (int i = 0; i < digits.length; i++){
            if (!carry) {
                break;
            }
            int sum = digits[i] + 1;
            if (sum < 10) {
                carry = false;
                digits[i] = sum;
            } else {
                digits[i] = sum - 10;
            }
        }
        reverseArrayInPlace(digits);
        if (carry) {
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i-1];
            }
            return result;
        }
        return digits;
    }

    private void reverseArrayInPlace(int[] digits) {
        int start = 0;
        int end = digits.length - 1;
        while (start < end) {
            int tmp = digits[start];
            digits[start] = digits[end];
            digits[end] = tmp;
            start++;
            end--;
        }
    }
}
