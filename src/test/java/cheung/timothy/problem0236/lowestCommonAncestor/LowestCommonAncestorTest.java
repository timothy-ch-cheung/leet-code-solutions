package cheung.timothy.problem0236.lowestCommonAncestor;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LowestCommonAncestorTest {
    private final LowestCommonAncestor solution = new LowestCommonAncestor();

    @Test
    void lowestCommonAncestorTwoItem() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        TreeNode answer = solution.lowestCommonAncestor(root, root.left, root);
        assertThat(answer, is(root));
    }

    @Test
    void lowestCommonAncestorNineItem() {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode answer = solution.lowestCommonAncestor(root, root.left, root.right);
        assertThat(answer, is(root));
    }
}