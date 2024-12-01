package cheung.timothy.problem1207.uniqueNumOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int num : arr) {
            if (numCount.containsKey(num)) {
                numCount.put(num, numCount.get(num) + 1);
            } else {
                numCount.put(num, 1);
            }
        }
        return numCount.size() == new HashSet<>(numCount.values()).size();
    }
}
