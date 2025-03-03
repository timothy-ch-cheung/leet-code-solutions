package cheung.timothy.problem0236.lowestCommonAncestor;

import java.util.*;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        setParentMap(root, parentMap);
        Set<TreeNode> pParents = new HashSet<>();
        TreeNode curr = p;
        while (curr != root) {
            pParents.add(curr);
            curr = parentMap.get(curr);
        }
        pParents.add(root);
        curr = q;
        while (!pParents.contains(curr)) {
            curr = parentMap.get(curr);
        }
        return curr;
    }

    private void setParentMap(TreeNode node, Map<TreeNode, TreeNode> parentMap) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            parentMap.put(node.left, node);
        }
        if (node.right != null) {
            parentMap.put(node.right, node);
        }
        setParentMap(node.left, parentMap);
        setParentMap(node.right, parentMap);
    }
}
