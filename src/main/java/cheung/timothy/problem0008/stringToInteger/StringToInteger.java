package cheung.timothy.problem0008.stringToInteger;

public class StringToInteger {
    public int myAtoi(String s) {
        int i = 0;
        int result = 0;
        int sign = 1;

        if (s.length() == 0) {
            return 0;
        }

        // Step 1: Ignore whitespace
        while(i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Read Sign
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        // Step 3: Read in digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int nextDigit = charToInt(s.charAt(i));
            int overflowValue = willOverflow(result, nextDigit);
            if (overflowValue != 0) {
                return overflowValue;
            }
            result = (result * 10) + (nextDigit * sign);
            i++;
        }

        return result;
    }

    public int willOverflow(int current, int toBeAdded) {
        if (current > 214748364 || (current == 214748364 && toBeAdded > 7)) {
            return Integer.MAX_VALUE;
        }
        if (current < -214748364 || (current == -214748364 && toBeAdded > 8)) {
            return Integer.MIN_VALUE;
        }
        return 0;
    }

    public int charToInt(char c){
        switch (c) {
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            default: return 0;
        }
    }
}
