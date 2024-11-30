package cheung.timothy.problem1456.maxNumVowelsInSubstring;

public class MaxNumVowelsInSubstring {

    private static final String VOWELS = "aeiou";

    public int maxVowels(String s, int k) {
        int currentVowels = 0;
        for (int i = 0; i < k; i++) {
            if (VOWELS.indexOf(s.charAt(i)) != -1) {
                currentVowels++;
            }
        }
        int maxVowels = currentVowels;
        for (int i = k; i < s.length(); i++) {
            if (VOWELS.indexOf(s.charAt(i)) != -1) {
                currentVowels++;
            }
            if (VOWELS.indexOf(s.charAt(i-k)) != -1) {
                currentVowels--;
            }
            if (maxVowels < currentVowels) {
                maxVowels = currentVowels;
            }
        }
        return maxVowels;
    }
}
