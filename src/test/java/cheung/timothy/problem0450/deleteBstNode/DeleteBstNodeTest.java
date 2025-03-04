package cheung.timothy.problem0450.deleteBstNode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DeleteBstNodeTest {
    private final DeleteBstNode solution = new DeleteBstNode();

    @Test
    void deleteLeftNode() {
        TreeNode root = new TreeNode(4);
        TreeNode left1 = new TreeNode(2);
        root.left = left1;
        TreeNode right1 = new TreeNode(5);
        root.right = right1;
        TreeNode left2 = new TreeNode(1);
        root.left.left = left2;
        TreeNode right2 = new TreeNode(3);
        root.left.right = right2;

        TreeNode answer = solution.deleteNode(root, 2);

        assertThat(answer, is(root));
        assertThat(answer.left, is(left2));
        assertThat(answer.left.right, is(right2));
        assertThat(answer.right, is(right1));
    }

    @Test
    void deleteRootNode() {
        TreeNode root = new TreeNode(4);
        TreeNode left1 = new TreeNode(2);
        root.left = left1;
        TreeNode right1 = new TreeNode(5);
        root.right = right1;
        TreeNode left2 = new TreeNode(1);
        root.left.left = left2;
        TreeNode right2 = new TreeNode(3);
        root.left.right = right2;

        TreeNode answer = solution.deleteNode(root, 4);

        assertThat(answer, is(left1));
        assertThat(answer.left, is(left2));
        assertThat(answer.right, is(right2));
        assertThat(answer.right.right, is(right1));
    }
}