package cheung.timothy.problem0038.countAndSay;

public class CountAndSay {

    public String countAndSay(int n) {
        String curr = "1";
        for (int i = 0; i < n-1; i++) {
            curr = runLengthEncode(curr);
        }
        return curr;
    }

    private String runLengthEncode(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        Character curr = null;
        for (int i = 0; i < s.length(); i++) {
            if (curr == null || curr != s.charAt(i)) {
                if (curr != null) {
                    sb.append(count);
                    sb.append(curr);
                }
                count = 1;
                curr = s.charAt(i);
            } else {
                count++;
            }
        }
        if (curr != null) {
            sb.append(count);
            sb.append(curr);
        }
        return sb.toString();
    }
}
