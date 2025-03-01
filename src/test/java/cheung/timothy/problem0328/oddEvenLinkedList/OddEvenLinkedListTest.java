package cheung.timothy.problem0328.oddEvenLinkedList;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

class OddEvenLinkedListTest {
    private final OddEvenLinkedList solution = new OddEvenLinkedList();

    @Test
    void oddEvenFiveItemList() {
        ListNode fifth = new ListNode(5);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        ListNode answer = solution.oddEvenList(first);
        assertThat(answer, is(first));
        assertThat(answer.next, is(third));
        assertThat(answer.next.next, is(fifth));
        assertThat(answer.next.next.next, is(second));
        assertThat(answer.next.next.next.next, is(fourth));
        assertNull(answer.next.next.next.next.next);
    }

    @Test
    void oddEvenThreeItemList() {
        ListNode third = new ListNode(3);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        ListNode answer = solution.oddEvenList(first);
        assertThat(answer, is(first));
        assertThat(answer.next, is(third));
        assertThat(answer.next.next, is(second));
        assertNull(answer.next.next.next);
    }

    @Test
    void oddEvenTwoItemList() {
        ListNode second = new ListNode(2, null);
        ListNode first = new ListNode(1, second);

        ListNode answer = solution.oddEvenList(first);
        assertThat(answer, is(first));
        assertThat(answer.next, is(second));
        assertNull(answer.next.next);
    }

    @Test
    void oddEvenTwoSingleList() {
        ListNode first = new ListNode(1, null);

        ListNode answer = solution.oddEvenList(first);
        assertThat(answer, is(first));
        assertNull(answer.next);
    }
}