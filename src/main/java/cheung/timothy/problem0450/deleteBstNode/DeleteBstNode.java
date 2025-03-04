package cheung.timothy.problem0450.deleteBstNode;

public class DeleteBstNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        } else if (root.val == key) {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null && root.right != null) {
                TreeNode newParent = findMax(root.left);
                newParent.right = root.right;
                return root.left;
            } else if (root.left != null) {
                return root.left;
            } else {
                return root.right;
            }
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    private TreeNode findMax(TreeNode node) {
        if (node == null) {
            return null;
        } else if (node.right != null) {
            return findMax(node.right);
        } else {
            return node;
        }
    }
}
