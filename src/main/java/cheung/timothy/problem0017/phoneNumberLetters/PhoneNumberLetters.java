package cheung.timothy.problem0017.phoneNumberLetters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneNumberLetters {

    private static final Map<Character, List<String>> numberToCharacters = Map.of(
            '2', List.of("a", "b", "c"),
            '3', List.of("d", "e", "f"),
            '4', List.of("g", "h", "i"),
            '5', List.of("j", "k", "l"),
            '6', List.of("m", "n", "o"),
            '7', List.of("p", "q", "r", "s"),
            '8', List.of("t", "u", "v"),
            '9', List.of("w", "x", "y", "z")
    );

    public List<String> letterCombinations(String digits) {
        List<String> combos = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            for (String s: numberToCharacters.get(digits.charAt(i))) {

            }
        }
    }
}
