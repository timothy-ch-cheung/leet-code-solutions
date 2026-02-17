package cheung.timothy.problem0083.removeDuplicates;

import cheung.timothy.structure.ListNode;

public class RemoveDuplicatesLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode uniq = head;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            uniq.next = null;
            if (curr.val != uniq.val) {
                uniq.next = curr;
                uniq = curr;
            }
        }
        return head;
    }
}
