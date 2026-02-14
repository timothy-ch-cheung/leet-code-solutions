package cheung.timothy.problem0024.swapNodesInPairs;

import cheung.timothy.structure.ListNode;

public class SwapNodeInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode newHead = head.next;
            head.next = swapPairs(head.next.next);
            newHead.next = head;
            return newHead;
        }
    }
}
