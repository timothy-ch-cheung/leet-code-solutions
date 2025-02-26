package cheung.timothy.problem2390.removeStars;

import java.util.Stack;

public class RemoveStars {

    public String removeStars(String s) {
        Stack<Character> charStack = new Stack<>();
        for (Character character : s.toCharArray()) {
            if (character == '*') {
                charStack.pop();
            } else {
                charStack.push(character);
            }
        }
        StringBuilder result = new StringBuilder();
        charStack.forEach(character -> result.append(character));
        return result.toString();
    }
}
