package cheung.timothy.problem0007.reverseInteger;

public class ReverseInteger {
    public int reverse(int x) {
        int reversedX = 0;
        int remainder = x % 10;
            x /= 10;
        while (remainder != 0 || x != 0) {
            if (willOverflow(reversedX, remainder)) {
                return 0;
            }
            reversedX = (reversedX * 10) + remainder;
            remainder = x % 10;
            x /= 10;
        }
        return reversedX;
    }

    public boolean willOverflow(int current, int toBeAdded) {
        if (current > 214748364 || (current == 214748364 && toBeAdded > 7)) {
            return true;
        }
        if (current < -214748364 || (current == -214748364 && toBeAdded < -8)) {
            return true;
        }
        return false;
    }
}
