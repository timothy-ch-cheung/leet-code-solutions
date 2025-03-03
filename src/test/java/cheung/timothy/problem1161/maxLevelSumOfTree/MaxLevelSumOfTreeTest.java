package cheung.timothy.problem1161.maxLevelSumOfTree;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MaxLevelSumOfTreeTest {

    private final MaxLevelSumOfTree solution = new MaxLevelSumOfTree();

    @Test
    void shouldReturnMaxSum() {
        TreeNode node = new TreeNode(10, new TreeNode(6), new TreeNode(5));
        int answer = solution.maxLevelSum(node);
        assertThat(answer, is(2));
    }
}