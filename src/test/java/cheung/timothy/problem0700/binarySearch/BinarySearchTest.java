package cheung.timothy.problem0700.binarySearch;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BinarySearchTest {
    private final BinarySearch solution = new BinarySearch();

    @Test
    void shouldFindValue() {
        TreeNode target = new TreeNode(111);
        TreeNode parent = new TreeNode(1, null, target);

        TreeNode answer = solution.searchBST(parent, 111);
        assertThat(answer, is(target));
    }
}