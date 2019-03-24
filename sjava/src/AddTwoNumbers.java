public class AddTwoNumbers {
    public ListNode add(ListNode l1, ListNode l2) {
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode start = null;
        ListNode last = null;

        int carry = 0;

        while (h1 != null || h2 != null) {
            int i = (h1 != null) ? h1.value : 0;
            int j = (h2 != null) ? h2.value : 0;

            int sum = carry + i + j;
            carry = sum / 10;
            sum = sum % 10;

            last = append(last, sum);
            if (start == null) {
                start = last;
            }

            if (h1 != null) {
                h1 = h1.next;
            }
            if (h2 != null) {
                h2 = h2.next;
            }
        }

        if (carry > 0) {
            last = append(last, carry);
            if (start == null) {
                start = last;
            }
        }

        return start;
    }

    ListNode append(ListNode last, int value) {
        ListNode newLast = new ListNode(value);
        if (last != null) {
            last.next = newLast;
        }
        return newLast;
    }
}
