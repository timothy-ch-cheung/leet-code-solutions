package cheung.timothy.problem0017.phoneNumberLetters;

import java.util.*;

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
        Map<Integer, List<String>> combos = new HashMap();
        combos.put(0, Collections.singletonList(""));
        for (int i = 0; i < digits.length(); i++) {
            List<String> newLayer = new ArrayList<>();
            for (String prefix: combos.get(i)) {
                for (String s: numberToCharacters.get(digits.charAt(i))) {
                    newLayer.add(prefix + s);
                }
            }
            combos.put(i+1, newLayer);
        }
        return combos.get(digits.length());
    }
}
