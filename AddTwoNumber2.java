import java.util.*;

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

public class AddTwoNumber2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> l1Stack = new Stack<>();
        while (l1 != null) {
            l1Stack.push(l1.val);
            l1 = l1.next;
        }
        Stack<Integer> l2Stack = new Stack<>();
        while (l2 != null) {
            l2Stack.push(l2.val);
            l2 = l2.next;
        }

        ListNode result = null;
        int carry = 0;
        while (!l1Stack.isEmpty() || !l2Stack.isEmpty() || carry != 0) {
            int x = l1Stack.isEmpty() ? 0 : l1Stack.pop();
            int y = l2Stack.isEmpty() ? 0 : l2Stack.pop();

            int sum = carry + x + y;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = result;
            result = newNode;
        }

        return result;
    }
}
