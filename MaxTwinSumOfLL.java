import java.util.*;

public class MaxTwinSumOfLL {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        for (ListNode cur = head; cur != null; cur = cur.next) {
            list.add(cur.val);
        }

        int n = list.size();

        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int curSum = list.get(i) + list.get(n - 1 - i);
            maxSum = Math.max(curSum, maxSum);
        }

        return maxSum;
    }
}
