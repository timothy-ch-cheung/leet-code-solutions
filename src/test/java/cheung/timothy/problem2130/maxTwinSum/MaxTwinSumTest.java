package cheung.timothy.problem2130.maxTwinSum;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MaxTwinSumTest {
    private final MaxTwinSum solution = new MaxTwinSum();

    @Test
    void shouldFindMaxTwinSumForFourItemLinkedList() {
        ListNode fourth = new ListNode(6);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        int answer = solution.pairSum(first);
        assertThat(answer, is(7));
    }

    @Test
    void shouldFindMaxTwinSumForSixItemLinkedList() {
        ListNode sixth = new ListNode(1);
        ListNode fifth = new ListNode(1, sixth);
        ListNode fourth = new ListNode(6, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        int answer = solution.pairSum(first);
        assertThat(answer, is(9));
    }
}