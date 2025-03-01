package cheung.timothy.problem0206.reverseLinkedList;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ReverseLinkedListTest {
    private final ReverseLinkedList solution = new ReverseLinkedList();

    @Test
    void reverseTwoItemList() {
        ListNode second = new ListNode(2, null);
        ListNode first = new ListNode(1, second);

        ListNode answer = solution.reverseList(first);
        assertThat(answer, is(second));
        assertThat(answer.next, is(first));
    }
}