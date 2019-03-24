public class MergeKListsRunner {

    public void run() {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(8);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        ListNode l3 = new ListNode(9);
        l3.next = new ListNode(12);

        ListNode l4 = new ListNode(22);
        l4.next = new ListNode(25);

        ListNode[] list = new ListNode[4];
        list[0] = l1;
        list[1] = l2;
        list[2] = l3;
        list[3] = l4;

        MergeKLists mergeKLists = new MergeKLists();
        ListNode result = mergeKLists.merge(list);
        Print.printLinkList(result);
        System.out.println("------------------------");
    }

}
