public class ConvertBinaryNumberFromLinkedList {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            ans *= 2;
            ans += cur.val;
        }
        return ans;
    }
}
