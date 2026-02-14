package cheung.timothy.problem0021.mergeTwoLists;

import cheung.timothy.structure.ListNode;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode larger;
        ListNode smaller;
        if (list1.val > list2. val) {
            larger = list1;
            smaller = list2;
        } else {
            smaller = list1;
            larger = list2;
        }
        smaller.next = mergeTwoLists(smaller.next, larger);
        return smaller;
    }
}