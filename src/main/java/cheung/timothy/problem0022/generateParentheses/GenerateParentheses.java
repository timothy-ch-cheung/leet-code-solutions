package cheung.timothy.problem0022.generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        generate("", n, n, results);
        return results;
    }

    private void generate(String acc, int left, int right, List<String> result) {
        if (right == 0 && left == 0) {
            result.add(acc);
            return;
        }
        if (left > 0) {
            generate(acc + "(", left -1, right, result);
        }
        if (left < right) {
            generate(acc + ")", left, right -1, result);
        }
    }
}
