package cheung.timothy.problem0020.validParatheses;

import java.util.Map;

public class ValidParentheses {
    private static final Map<Character, Character> OPEN_BRACKETS = Map.of(
            '(', ')',
            '[', ']',
            '{', '}'
    );

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        char[] stack = new char[s.length()];
        int stackPointer = 0;
        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i);
            if (OPEN_BRACKETS.get(curr) != null) {
                stack[stackPointer] = curr;
                stackPointer++;
            } else {
                if (stackPointer - 1 < 0) {
                    return false;
                }
                if (OPEN_BRACKETS.get(stack[stackPointer-1]) != curr) {
                    return false;
                }
                stackPointer--;
            }
        }
        return stackPointer == 0;
    }
}
