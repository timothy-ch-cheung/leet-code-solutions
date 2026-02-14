package cheung.timothy.problem0024.swapNodesInPairs;

import cheung.timothy.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SwapNodeInPairsTest {
    private static final SwapNodeInPairs solution = new SwapNodeInPairs();

    @Test
    void shouldSwap() {
        ListNode result = solution.swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));

        assertThat(result.val, is(2));
        assertThat(result.next.val, is(1));
        assertThat(result.next.next.val, is(4));
        assertThat(result.next.next.next.val, is(3));
    }
}