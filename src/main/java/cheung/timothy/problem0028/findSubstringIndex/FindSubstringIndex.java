package cheung.timothy.problem0028.findSubstringIndex;

public class FindSubstringIndex {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (needle.equals(haystack.substring(i, i+needle.length()))) {
                return i;
            }
        }
        return -1;
    }
}
