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

public class MergeInBtwLL {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        ListNode x = curr;
        while (curr.val != a) {
            x = curr;
            curr = curr.next;
        }

        while (curr.val != b) {
            curr = curr.next;
        }

        x.next = list2;
        while (x.next != null) {
            x = x.next;
        }

        x.next = curr;

        return list1;
    }
}
