package cheung.timothy.problem1448.binTreeGoodNodes;

public class BinTreeGoodNodes {
    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, Integer.MIN_VALUE);
    }

    private int countGoodNodes(TreeNode node, int currentMax) {
        if (node == null) {
            return 0;
        }
        if (node.val >= currentMax) {
            return 1 + countGoodNodes(node.left, node.val) + countGoodNodes(node.right, node.val);
        } else {
            return countGoodNodes(node.left, currentMax) + countGoodNodes(node.right, currentMax);
        }
    }
}
