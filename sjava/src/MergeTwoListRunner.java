public class MergeTwoListRunner {
    public void run() {
        // l1: 2 -> 4 -> 7
        // l2: 2 -> 8 -> 9
        // result: 2 -> 2 - > 4 -> 8 -> 7 -> 9
        ListNode l5 = new ListNode(2);
        l5.next = new ListNode(4);
        l5.next.next = new ListNode(7);

        ListNode l6 = new ListNode(2);
        l6.next = new ListNode(8);
        l6.next.next = new ListNode(9);

        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode result3 = mergeTwoLists.merge(l5, l6);
        Print.printLinkList(result3);
        System.out.println("------------------------");
    }
}
