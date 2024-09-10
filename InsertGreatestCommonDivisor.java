// Definition for singly-linked list.
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

public class InsertGreatestCommonDivisor {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy.next;
        while (curr.next != null) {
            int num1 = curr.val;
            int num2 = curr.next.val;
            int res = gcd(num1, num2);
            ListNode nextNode = new ListNode(res);
            nextNode.next = curr.next;
            curr.next = nextNode;
            curr = curr.next.next;
        }
        return dummy.next;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}