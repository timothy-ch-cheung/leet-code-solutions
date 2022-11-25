package cheung.timothy.problem3.longestSubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringSolution {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<String> usedCharacters = new HashSet<>();
        String[] stringList = s.split("");
        for (int i = 0; i < s.length(); i++) {
            int currLength = 0;
            int currIndex = i;
            while(currIndex < s.length() && !usedCharacters.contains(stringList[currIndex])) {
                usedCharacters.add(stringList[currIndex]);
                currLength += 1;
                currIndex +=1;
            }
            max = Math.max(currLength, max);
            usedCharacters = new HashSet<>();
        }
        return max;
    }
}
