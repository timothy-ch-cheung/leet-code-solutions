package cheung.timothy.problem2.addTwoNumbers;

public class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode current = answer;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = 0;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;

            carry = sum / 10;
            sum = sum % 10;

            ListNode newNode = new ListNode(sum);
            current.next = newNode;
            current = newNode;
        }

        return answer.next;
    }
}