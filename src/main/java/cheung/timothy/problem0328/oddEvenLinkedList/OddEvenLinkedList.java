package cheung.timothy.problem0328.oddEvenLinkedList;

// in: 1 -> 2 -> 3 out: 1 -> 3 -> 2
// head = 1
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        boolean isOdd = true;
        ListNode currentOdd = new ListNode(0, null);
        ListNode currentEven = new ListNode(0, null);
        ListNode current = head;
        ListNode evenHead = head.next;
        while (current != null) {
            if (isOdd) {
                currentOdd.next = current;
                currentOdd = current;
            } else {
                currentEven.next = current;
                currentEven = current;
            }
            current = current.next;
            isOdd = !isOdd;
        }
        currentOdd.next = evenHead;
        currentEven.next = null;
        return head;
    }
}