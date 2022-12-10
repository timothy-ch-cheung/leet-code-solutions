package cheung.timothy.problem14.longestCommonPrefix;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strings) {
        boolean mismatched = false;
        int i = 0;
        StringBuilder prefix = new StringBuilder();

        while (!mismatched) {
            Character currentChar = null;
            for (String s : strings) {
                if (i >= s.length()) {
                    return prefix.toString();
                }
                if (currentChar == null) {
                    currentChar = s.charAt(i);
                }
                if (s.charAt(i) != currentChar) {
                    mismatched = true;
                    break;
                }
            }
            if (!mismatched) {
                prefix.append(currentChar);
                i++;
            }
        }
        return prefix.toString();
    }
}
