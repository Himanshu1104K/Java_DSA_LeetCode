
public class MiddleOfLL {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }

        count /= 2;
        node = head;
        while (count != 0) {
            node = node.next;
            count--;
        }
        return node;
    }
}
