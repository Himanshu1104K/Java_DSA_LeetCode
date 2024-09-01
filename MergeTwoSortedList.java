
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

class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode Curr = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                Curr.next = new ListNode(list2.val, null);
                list2 = list2.next;
            } else {
                Curr.next = new ListNode(list2.val, null);
                list1 = list1.next;
            }
            Curr = Curr.next;
        }
        while (list1 != null) {
            Curr.next = new ListNode(list1.val, null);
            Curr = Curr.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            Curr.next = new ListNode(list2.val, null);
            Curr = Curr.next;
            list2 = list2.next;
        }
        return dummy.next;
    }
}