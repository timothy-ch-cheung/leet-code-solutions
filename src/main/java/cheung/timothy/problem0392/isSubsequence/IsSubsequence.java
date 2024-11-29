package cheung.timothy.problem0392.isSubsequence;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int subsequenceIdx = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(subsequenceIdx) == t.charAt(i)) {
                subsequenceIdx++;
            }
            if (subsequenceIdx == s.length()) {
                return true;
            }
        }
        return false;
    }
}
