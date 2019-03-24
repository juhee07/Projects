import java.util.Comparator;

public class ListNodeComparator implements Comparator<ListNode> {

    public int compare(ListNode l1, ListNode l2){
        if(l1.value < l2.value) {
            return -1;
        }
        else if (l1.value > l2.value) {
            return 1;
        }
        return 0;
    }
}
