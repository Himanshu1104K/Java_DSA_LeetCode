
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

public class RemoveDuplicateSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        // Base Case
        if (head == null || head.next == null) {
            return head;
        }

        // Logic of the program

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null && curr.next.next != null) {
            if (curr.next.val == curr.next.next.val) {
                int x = curr.next.val;
                while (curr.next != null && curr.next.val == x) {
                    curr.next = curr.next.next;
                }
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    public static ListNode deleteDuplicatesEasy(ListNode head) {
        // Base Case
        if (head == null || head.next == null) {
            return head;
        }

        // Logic of the code
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy.next;
        while (curr.next != null) {
            if (curr.next.val == curr.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode curr = head.next;
        curr.next = new ListNode(3);
        curr = curr.next;
        curr.next = new ListNode(3);
        curr = curr.next;
        curr.next = new ListNode(4);
        curr = curr.next;
        curr.next = new ListNode(4);
        curr = curr.next;
        curr.next = new ListNode(5, null);

        deleteDuplicates(head);
    }
}
