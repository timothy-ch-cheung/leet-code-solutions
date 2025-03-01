package cheung.timothy.problem2095.deleteMiddleNode;

public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        int length = 1;
        ListNode curr = head;
        while (curr.next != null) {
            length++;
            curr = curr.next;
        }
        int middle = length/2;
        if (length == 1) {
            return null;
        }
        curr = head;
        for (int i = 0; i < middle; i++) {
            if (i == middle -1) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
