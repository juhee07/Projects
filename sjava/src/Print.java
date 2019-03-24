public class Print {

    public static void printLinkList(ListNode result3) {
        while (result3 != null) {
            System.out.println(result3.value);
            result3 = result3.next;
        }
    }
}
