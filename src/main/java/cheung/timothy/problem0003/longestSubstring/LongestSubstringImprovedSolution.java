package cheung.timothy.problem0003.longestSubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringImprovedSolution {

    public int lengthOfLongestSubstring(String s) {
        Set<String> usedCharacters = new HashSet<>();
        String[] stringList = s.split("");

        int i = 0;
        int max = 0;

        for (int j = 0; j < s.length(); j++) {
            if (usedCharacters.contains(stringList[j])) {
                int length = j - i;
                max = Math.max(max, length);
                while (usedCharacters.contains(stringList[j])) {
                    usedCharacters.remove(stringList[i]);
                    i += 1;
                }
            }
            usedCharacters.add(stringList[j]);
        }
        max = Math.max(max, usedCharacters.size());
        return max;
    }
}
