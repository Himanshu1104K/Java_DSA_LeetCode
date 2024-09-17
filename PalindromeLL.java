
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

public class PalindromeLL {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode list1 = head;
        ListNode list2 = null;
        while (list1 != null) {
            ListNode newNode = new ListNode(list1.val);
            newNode.next = list2;
            list2 = newNode;
            list1 = list1.next;
        }

        while (head != null && list2 != null) {
            if (head.val != list2.val) {
                return false;
            }
            head = head.next;
            list2 = list2.next;
        }

        return true;
    }
}

// list2.next = new ListNode(head.val, null);
// head = head.next;
// while (head != null) {
//     ListNode curr = head;
//     head = head.next;
//     curr.next = list2.next;
//     list2.next = curr;
// }
// list2 = list2.next;
// while (list1 != null && list2 != null) {
//     if (list1.val != list2.val) {
//         return false;
//     }
//     list1 = list1.next;
//     list2 = list2.next;
    // }
