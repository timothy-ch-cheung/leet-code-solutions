package cheung.timothy.problem0083.removeDuplicates;

import cheung.timothy.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveDuplicatesLinkedListTest {

    private static final RemoveDuplicatesLinkedList solution = new RemoveDuplicatesLinkedList();

    @Test
    void removeDuplicates() {
        ListNode result = solution.deleteDuplicates(new ListNode(1, new ListNode(2, new ListNode(2))));
        assertThat(result.val, is(1));
        assertThat(result.next.val, is(2));
        assertNull(result.next.next);
    }

}