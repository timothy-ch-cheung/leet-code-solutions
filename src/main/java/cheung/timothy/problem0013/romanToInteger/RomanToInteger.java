package cheung.timothy.problem0013.romanToInteger;

import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> ROMAN_TO_INT = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );
    public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = ROMAN_TO_INT.get(s.charAt(i));
            if (i < s.length() -1 && val < ROMAN_TO_INT.get(s.charAt(i+1))) {
                total -= val;
            } else {
                total += val;
            }
        }
        return total;
    }
}
