package cheung.timothy.problem0104.maxBinTreeDepth;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MaxBinTreeDepthTest {
    private final MaxBinTreeDepth solution = new MaxBinTreeDepth();

    @Test
    void shouldFindMaxDepth() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), null), new TreeNode(6, null, null));
        int answer = solution.maxDepth(root);
        assertThat(answer, is(3));
    }
}