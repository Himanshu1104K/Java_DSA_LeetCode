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

public class MergeNodeInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode index = head;
        int outPut = 0;
        curr = curr.next;
        while (curr != null) {
            if (curr.val == 0) {
                index.val = outPut;
                outPut = 0;
                if (curr.next == null) {
                    index.next = null;
                } else {
                    index = index.next;
                }
            } else {
                outPut += curr.val;
            }
            curr = curr.next;
        }
        return head;
    }
}