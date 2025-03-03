package cheung.timothy.problem0199.binTreeRightSideView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BinTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> view = new ArrayList<>();
        populateRightSideView(root, view, 0, new HashSet<>());
        return view;
    }

    private void populateRightSideView(TreeNode node, List<Integer> view, int currentDepth, Set<Integer> levels) {
        if (node == null) {
            return;
        }
        if (!levels.contains(currentDepth)) {
            view.add(node.val);
            levels.add(currentDepth);
        }
        populateRightSideView(node.right,view, currentDepth + 1, levels);
        populateRightSideView(node.left, view, currentDepth + 1, levels);
    }
}
