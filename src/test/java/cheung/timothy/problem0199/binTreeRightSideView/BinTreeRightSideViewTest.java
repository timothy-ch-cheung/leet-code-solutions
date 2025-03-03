package cheung.timothy.problem0199.binTreeRightSideView;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BinTreeRightSideViewTest {
    private final BinTreeRightSideView solution = new BinTreeRightSideView();

    @Test
    void rightSideView() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(2);
        List<Integer> answer = solution.rightSideView(root);
        assertThat(answer, is(Arrays.asList(1, 3)));
    }
}