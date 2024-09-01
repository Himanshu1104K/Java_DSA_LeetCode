import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (var list : lists) {
            if (list != null) {
                pq.offer(list);
            }
        }

        ListNode Dummy = new ListNode(0);
        ListNode curr = Dummy;

        while (!pq.isEmpty()) {
            ListNode minNode = pq.poll();
            curr.next = minNode;
            curr = curr.next;

            if (minNode.next != null) {
                pq.offer(minNode.next);
            }
        }

        return Dummy.next;
    }

    public static void main(String[] args) {

    }
}
// ListNode Dummy = new ListNode(0);
// ListNode curr;
// for (ListNode list : lists) {
// curr = Dummy.next;
// ListNode list1 = curr;
// ListNode list2 = list;
// while (list1 != null && list2 != null) {
// if (list1.val <= list2.val) {
// curr.next = new ListNode(list1.val, null);
// list1 = list1.next;
// } else {
// curr.next = new ListNode(list2.val, null);
// list2 = list2.next;
// }
// curr = curr.next;
// }
// while (list1 != null) {
// curr.next = new ListNode(list1.val, null);
// curr = curr.next;
// list1 = list1.next;
// }
// while (list2 != null) {
// curr.next = new ListNode(list2.val, null);
// curr = curr.next;
// list2 = list2.next;
// }
// }