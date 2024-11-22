package cheung.timothy.problem1768.mergeStringsAlternately;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while ( idx < word1.length() && idx < word2.length()) {
            sb.append(word1.charAt(idx));
            sb.append(word2.charAt(idx));
            idx++;
        }
        if (word1.length() > word2.length()) {
            sb.append(word1.substring(idx));
        } else {
            sb.append(word2.substring(idx));
        }
        return sb.toString();
    }
}
