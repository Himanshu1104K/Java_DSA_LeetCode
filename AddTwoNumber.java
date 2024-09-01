
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

public class AddTwoNumber {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode head;
        // int carry = 0;
        // ListNode curr = new ListNode();
        // head = curr;
        // while (l1 != null || l2 != null) {
        // ListNode neww = new ListNode((carry + l1.val + l2.val) % 10, null);
        // curr.next = neww;
        // carry = (l1.val + l2.val) / 10;
        // l1 = l1.next;
        // l2 = l2.next;
        // curr = neww;
        // }
        // while (l1 != null) {
        // ListNode neww = new ListNode(l1.val, null);
        // curr.next = neww;
        // l1 = l1.next;
        // curr = neww;
        // }
        // while (l2 != null) {
        // ListNode neww = new ListNode(l2.val, null);
        // curr.next = neww;
        // l2 = l2.next;
        // curr = neww;
        // }
        // if (carry != 0) {
        // ListNode neww = new ListNode(carry, null);
        // curr.next = neww;
        // }
        // return head;

        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry != 0) {
            curr.next = new ListNode(carry);
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        addTwoNumbers(l1, l2);
    }
}
