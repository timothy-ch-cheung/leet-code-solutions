package cheung.timothy.problem0872.leafSimilarTrees;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafSequence1 = new ArrayList<>();
        getLeafSequence(root1, leafSequence1);
        List<Integer> leafSequence2 = new ArrayList<>();
        getLeafSequence(root2, leafSequence2);
        return leafSequence1.equals(leafSequence2);
    }

    private void getLeafSequence(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            result.add(node.val);
        }
        getLeafSequence(node.left, result);
        getLeafSequence(node.right, result);
    }
}
