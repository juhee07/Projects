public class AddTwoNumbersRunner {

    public void run() {
        // l1: 2 -> 4 -> 3
        // l2: 5 -> 6 -> 4
        // result: 7 -> 0 - > 8
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(2);

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(5);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.add(l1, l2);

        Print.printLinkList(result);
        System.out.println("------------------------");

        // l1: 2
        // l2: 6 -> 8 -> 7
        // result: 8 -> 8 - > 7
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(6);
        l4.next = new ListNode(8);
        l4.next.next = new ListNode(7);

        AddTwoNumbers addTwoNumbers2 = new AddTwoNumbers();
        ListNode result2 = addTwoNumbers2.add(l3, l4);

        Print.printLinkList(result2);
        System.out.println("------------------------");

    }

}
