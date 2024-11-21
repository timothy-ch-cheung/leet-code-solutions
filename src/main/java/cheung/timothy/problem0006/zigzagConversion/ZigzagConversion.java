package cheung.timothy.problem0006.zigzagConversion;

import java.util.HashMap;
import java.util.Map;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        Map<Integer, StringBuilder> answer = new HashMap<>();
        for (int i = 0; i < numRows; i++) {
            answer.put(i, new StringBuilder());
        }

        int row = 0;
        boolean ascend = true;
        for (int i = 0; i < s.length(); i++) {
            answer.get(row).append(s.charAt(i));
            if(numRows != 1) {
                if (ascend) {
                    row++;
                } else {
                    row--;
                }
            }

            if(row == 0 || row == numRows -1) {
                ascend = !ascend;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(answer.get(i));
        }
        return result.toString();
    }

}
