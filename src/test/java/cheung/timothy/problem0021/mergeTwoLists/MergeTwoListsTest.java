package cheung.timothy.problem0021.mergeTwoLists;

import cheung.timothy.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class MergeTwoListsTest {

    private final static MergeTwoLists solution = new MergeTwoLists();

    @Test
    void shouldMergeTwoLists() {
        ListNode list1 = new ListNode(400);
        ListNode list2 = new ListNode(200, new ListNode(600));

        ListNode result = solution.mergeTwoLists(list1, list2);
        assertThat(result.val, is(200));
        assertThat(result.next.val, is(400));
        assertThat(result.next.next.val, is(600));
    }
}