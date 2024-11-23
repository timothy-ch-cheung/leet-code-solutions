package cheung.timothy.problem345.reverseVowels;

public class ReverseVowels {

    private static final String VOWELS = "AEIOUaeiou";

    public String reverseVowels(String s) {
        char[] input = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && VOWELS.indexOf(input[left]) == -1) {
                left++;
            }
            while (left < right && VOWELS.indexOf(input[right]) == -1) {
                right--;
            }
            char tmp = input[left];
            input[left] = input[right];
            input[right] = tmp;

            left++;
            right--;
        }

        return new String(input);
    }
}
