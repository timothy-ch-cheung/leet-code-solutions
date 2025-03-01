package cheung.timothy.problem2130.maxTwinSum;

public class MaxTwinSum {
    public int pairSum(ListNode head) {
        int mid = (length(head)/2) -1;
        ListNode midNode = head;
        for (int i = 0; i < mid; i++) {
            midNode = midNode.next;
        }
        ListNode head2 = reverse(midNode.next);
        midNode.next = null;
        int maxSum = 0;
        while (head != null && head2 !=null) {
            int sum = head.val + head2.val;
            if (sum > maxSum) {
                maxSum = sum;
            }
            head = head.next;
            head2 = head2.next;
        }
        return maxSum;
    }

    private int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}
