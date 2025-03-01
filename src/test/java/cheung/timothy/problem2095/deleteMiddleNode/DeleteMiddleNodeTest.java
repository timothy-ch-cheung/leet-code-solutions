package cheung.timothy.problem2095.deleteMiddleNode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

class DeleteMiddleNodeTest {
    private final DeleteMiddleNode solution = new DeleteMiddleNode();

    @Test
    void deleteMiddleThreeItemList() {
        ListNode third = new ListNode(3);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        ListNode answer = solution.deleteMiddle(first);
        assertThat(answer, is(first));
        assertThat(answer.next, is(third));
    }

    @Test
    void deleteMiddleTwoItemList() {
        ListNode second = new ListNode(2, null);
        ListNode first = new ListNode(1, second);

        ListNode answer = solution.deleteMiddle(first);
        assertThat(answer, is(first));
    }

    @Test
    void deleteMiddleSingleItemList() {
        ListNode first = new ListNode(1, null);

        ListNode answer = solution.deleteMiddle(first);
        assertNull(answer);
    }
}