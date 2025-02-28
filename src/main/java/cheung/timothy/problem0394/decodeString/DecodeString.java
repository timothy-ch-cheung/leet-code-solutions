package cheung.timothy.problem0394.decodeString;

import java.util.Set;
import java.util.Stack;

public class DecodeString {
    private static final Set<Character> DIGITS = Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        char curr = s.charAt(index);
        while (index < s.length()) {
            while (curr != ']') {
                stack.push(curr);
                index++;
                if (index >= s.length()) {
                    break;
                }
                curr = s.charAt(index);
            }
            if (index >= s.length()) {
                break;
            }

            StringBuilder subStringBuilder = new StringBuilder();
            char currChar = stack.pop();
            while (currChar != '[') {
                subStringBuilder.append(currChar);
                currChar = stack.pop();
            }
            StringBuilder countStringBuilder = new StringBuilder();
            while(!stack.isEmpty() && DIGITS.contains(stack.peek())) {
                countStringBuilder.append(stack.pop());
            }
            int count = Integer.parseInt(countStringBuilder.reverse().toString());
            String decodedString = repeat(subStringBuilder.reverse().toString(), count);
            for (int i = 0; i < decodedString.length(); i++) {
                stack.push(decodedString.charAt(i));
            }
            index++;
            if (index < s.length()) {
                curr = s.charAt(index);
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (Character character: stack) {
            resultBuilder.append(character);
        }
        return resultBuilder.toString();
    }

    private String repeat(String s, int times) {
        StringBuilder sb = new StringBuilder(s.length() * times);
        for (int i = 0; i < times; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
