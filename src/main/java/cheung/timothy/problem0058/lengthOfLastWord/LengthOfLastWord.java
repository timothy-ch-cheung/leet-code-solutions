package cheung.timothy.problem0058.lengthOfLastWord;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int idx = s.length() - 1;
        int length = 0;
        while (idx >= 0 && s.charAt(idx) != ' ') {
            length++;
            idx--;
        }
        return length;
    }
}
