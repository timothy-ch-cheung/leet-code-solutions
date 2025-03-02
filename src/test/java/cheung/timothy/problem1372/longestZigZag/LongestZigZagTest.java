package cheung.timothy.problem1372.longestZigZag;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LongestZigZagTest {
    private final LongestZigZag solution = new LongestZigZag();

    @Test
    void shouldReturnZigZag() {
        TreeNode right1 = new TreeNode(1);
        TreeNode left1 = new TreeNode(2, null, right1);
        TreeNode root = new TreeNode(1, left1, null);

        int answer = solution.longestZigZag(root);
        assertThat(answer, is(2));
    }
}