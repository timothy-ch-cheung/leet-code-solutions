package cheung.timothy.problem0872.leafSimilarTrees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeafSimilarTreesTest {
    private LeafSimilarTrees solution = new LeafSimilarTrees();

    @Test
    void shouldReturnTrueForLeafSimilarTree() {
        TreeNode root1 = generateThreeItemTree(1, 2, 3);
        TreeNode root2 = generateThreeItemTree(1, 2, 3);
        assertTrue(solution.leafSimilar(root1, root2));
    }

    @Test
    void shouldReturnFalseForNonLeafSimilarTree() {
        TreeNode root1 = generateThreeItemTree(1, 2, 3);
        TreeNode root2 = generateThreeItemTree(1, 3, 2);
        assertFalse(solution.leafSimilar(root1, root2));
    }

    private TreeNode generateThreeItemTree(int root, int left, int right) {
        return new TreeNode(root, new TreeNode(left, null, null), new TreeNode(right, null, null));
    }
}