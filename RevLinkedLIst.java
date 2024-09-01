
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

public class RevLinkedLIst {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = head;
        head = head.next;
        dummy.next = temp;
        temp.next = null;
        while (head != null) {
            temp = head;
            head = head.next;
            temp.next = dummy.next;
            dummy.next = temp;
        }
        return dummy.next;
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        // int i = 1;
        // ListNode temp = dummy.next;
        // while (i != left && temp != null) {
        //     temp = temp.next;
        //     i++;
        // }

        // ListNode dummy2 = new ListNode(0);
        // dummy2.next = temp;
        // temp = temp.next;
        // dummy2.next.next = null;
        // left++;
        // while (temp != null && left <= right) {
        //     ListNode temp2 = temp;
        //     temp = temp.next;
        //     temp2.next = dummy2.next;
        //     dummy2.next = temp2;
        // }

        ListNode dummy = new ListNode(0);
        

        return head;
    }

    public static void main(String[] args) {

    }
}
