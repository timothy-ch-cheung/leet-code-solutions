package cheung.timothy.problem1448.binTreeGoodNodes;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BinTreeGoodNodesTest {
    private final BinTreeGoodNodes solution = new BinTreeGoodNodes();

    @Test
    void countGoodNodes() {
        TreeNode root = generateSevenItemTree(3, 1, 4, 3, 1, 1, 5);
        int answer = solution.goodNodes(root);
        assertThat(answer, is(4));
    }

    private TreeNode generateSevenItemTree(int one, int two, int three, int four, int five, int six, int seven) {
        return new TreeNode(one, generateThreeItemTree(two, four, five), generateThreeItemTree(three, six, seven));
    }

    private TreeNode generateThreeItemTree(int root, int left, int right) {
        return new TreeNode(root, new TreeNode(left, null, null), new TreeNode(right, null, null));
    }
}