package cheung.timothy.problem0443.stringCompression;

public class StringCompression {
    public int compress(char[] chars) {
        int idx = 0;
        for (int i = 0; i < chars.length;) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            chars[idx] = currentChar;
            idx++;
            if (count > 1) {
                String countString = Integer.toString(count);
                for (int j = 0; j < countString.length(); j++) {
                    chars[idx] = countString.charAt(j);
                    idx++;
                }
            }
        }

        return idx;
    }
}
