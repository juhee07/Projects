
import java.util.PriorityQueue;

public class MergeKLists {
    public ListNode merge(ListNode[] lists) {

        ListNode curr = new ListNode(0);
        ListNode mergedList = curr;
        int size = lists.length;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(size, new ListNodeComparator());
        for(int i = 0; i < size; i++ ) {
            priorityQueue.add(lists[i]);
        }
        while(!priorityQueue.isEmpty()) {
            ListNode node = priorityQueue.remove();
            curr.next = node;
            curr = curr.next;
            if(node.next != null) {
                priorityQueue.add(node.next);
            }

        }
        return mergedList.next;

    }
}
