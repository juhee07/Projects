public class MergeTwoLists {
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(-1);
        ListNode preHead = prev;

        while(l1 != null && l2 != null) {
            if(l1.value < l2.value) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = (l1 == null) ? l2 :l1;
        return preHead.next;

    }
}
