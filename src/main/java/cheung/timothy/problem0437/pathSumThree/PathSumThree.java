package cheung.timothy.problem0437.pathSumThree;

import java.util.HashSet;

public class PathSumThree {
    public int pathSum(TreeNode root, int targetSum) {
        return pathSum(root, targetSum, new HashSet<>());
    }

    private int pathSum(TreeNode root, int targetSum, HashSet<TreeNode> visited) {
        int numPaths = 0;
        if (!visited.contains(root)) {
            visited.add(root);
            numPaths += pathSumHelper(root, targetSum, 0, visited);
        }
        return numPaths;
    }

    private int pathSumHelper(TreeNode node, int targetSum, int currTotal, HashSet<TreeNode> visited) {
        if (node == null) {
            return 0;
        }
        if (willOverflow(node.val, currTotal)) {
            return 0;
        }

        int numPaths = 0;
        if (currTotal + node.val == targetSum) {
            numPaths++;
        }
        numPaths += pathSumHelper(node.left, targetSum, currTotal + node.val, visited);
        numPaths += pathSumHelper(node.right, targetSum, currTotal + node.val, visited);
        numPaths += pathSum(node.left, targetSum, visited);
        numPaths += pathSum(node.right, targetSum, visited);
        return numPaths;
    }

    private boolean willOverflow(int a, int b) {
        try {
            Math.addExact(a, b);
            return false;
        } catch (ArithmeticException e) {
            return true;
        }
    }
}
