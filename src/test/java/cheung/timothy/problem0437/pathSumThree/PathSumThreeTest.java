package cheung.timothy.problem0437.pathSumThree;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PathSumThreeTest {
    private final PathSumThree solution = new PathSumThree();

    @Test
    void shouldFindNumPaths() {
        TreeNode root = new TreeNode(10, new TreeNode(4), new TreeNode(0));
        int answer = solution.pathSum(root, 10);
        assertThat(answer, is(2));
    }

    @Test
    void shouldFindNumPathsForLine() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5)))));
        int answer = solution.pathSum(root, 3);
        assertThat(answer, is(2));
    }

    @Test
    void shouldFindNumPathsEdgeCase() {
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(1);
        TreeNode root = new TreeNode(0, left, right);
        int answer = solution.pathSum(root, 1);
        assertThat(answer, is(4));
    }
}