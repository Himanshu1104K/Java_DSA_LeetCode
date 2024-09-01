
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

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        count = count - n;
        curr = head;
        ListNode ptr = new ListNode();
        while (curr != null && count >= 0) {
            ptr = curr;
            curr = curr.next;
            count--;
        }
        if (ptr != curr && curr.next != null) {
            ptr.next = curr.next;
        }
        return head;
    }
}
