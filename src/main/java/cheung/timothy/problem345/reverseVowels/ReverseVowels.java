package cheung.timothy.problem345.reverseVowels;

import java.util.Set;

public class ReverseVowels {

    private static final Set<String> VOWELS = Set.of("A", "E", "I", "O", "U", "a", "e", "i", "o", "u");

    public String reverseVowels(String s) {
        String[] input = s.split("");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            boolean isLeftVowel = VOWELS.contains(input[left]);
            boolean isRightVowel = VOWELS.contains(input[right]);
            if (isLeftVowel && isRightVowel) {
                String tmp = input[left];
                input[left] = input[right];
                input[right] = tmp;
            } else if (isLeftVowel) {
                right--;
                continue;
            } else if (isRightVowel) {
                left++;
                continue;
            }
            left++;
            right--;
        }

        return String.join("", input);
    }
}
