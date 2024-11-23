package cheung.timothy.problem151.reverseWordsInString;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = s.length() - 1;
        while (idx >= 0) {
            boolean skippedSpaces = false;
            while (idx >= 0  && s.charAt(idx) == ' ') {
                idx--;
                skippedSpaces = true;
            }
            boolean shiftedWord = false;
            while (idx >= 0  && s.charAt(idx) != ' ') {
                idx--;
                shiftedWord = true;
            }
            int wordIdx = idx;
            if (skippedSpaces || shiftedWord) {
                wordIdx++;
            }
            while (wordIdx < s.length() && s.charAt(wordIdx) != ' ') {
                sb.append(s.charAt(wordIdx));
                wordIdx++;
            }

            if (idx == 0) {
                break;
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
