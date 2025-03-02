package cheung.timothy.problem1372.longestZigZag;

public class LongestZigZag {
    public int longestZigZag(TreeNode root) {
        return Math.max(longestZigZag(root, true, 0), longestZigZag(root, false, 0)) -1;
    }

    private int longestZigZag(TreeNode root, boolean isLeft, int depth) {
        if (root == null) {
            return depth;
        }
        if (isLeft) {
            return Math.max(longestZigZag(root.right, false, depth + 1), longestZigZag(root.left, true, 1));
        } else {
            return Math.max(longestZigZag(root.left, true, depth + 1), longestZigZag(root.right, false, 1));
        }
    }
}
