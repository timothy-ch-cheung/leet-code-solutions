package cheung.timothy.problem0206.reverseLinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode prev, ListNode curr) {
        if (curr.next == null) {
            curr.next = prev;
            return curr;
        }
        ListNode tail = reverse(curr, curr.next);
        curr.next = prev;
        return tail;
    }
}