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
        ListNode curA = list1;

        for (int i = 0; i < a - 1; i++) {
            curA = curA.next;
        }

        ListNode curB = curA;
        for (int i = 0; i < b - a + 2; i++) {
            curB = curB.next;
        }

        curA.next = list2;

        ListNode tail = list2;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = curB;

        return list1;
    }
}
