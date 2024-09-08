
//   Definition for singly-linked list.
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

public class SplitLinkedListinParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode curr = head;
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        int baseSize = n / k;
        int extraNodes = n % k;

        ListNode[] result = new ListNode[k];
        curr = head;
        for (int i = 0; i < k; i++) {
            ListNode partHead = curr;
            result[i] = partHead;
            int partSize = baseSize + (extraNodes > 0 ? 1 : 0);
            extraNodes--;
            for (int j = 1; j < partSize; j++) {
                if (curr != null) {
                    curr = curr.next;
                }
            }
            if (curr != null) {
                ListNode nextPartHead = curr.next;
                curr.next = null;
                curr = nextPartHead;
            }
        }

        return result;
    }
}