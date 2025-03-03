package cheung.timothy.problem1161.maxLevelSumOfTree;

import java.util.HashMap;
import java.util.Map;

public class MaxLevelSumOfTree {
    public int maxLevelSum(TreeNode root) {
        Map<Integer, Integer> sums = new HashMap<>();
        calculateLevelSums(root, 1, sums);
        return sums.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    private void calculateLevelSums(TreeNode node, int depth, Map<Integer, Integer> sums) {
        if (node == null) {
            return;
        }
        if (!sums.containsKey(depth)) {
            sums.put(depth, node.val);
        } else {
            sums.put(depth, sums.get(depth) + node.val);
        }
        calculateLevelSums(node.left, depth + 1, sums);
        calculateLevelSums(node.right, depth + 1, sums);
    }
}
