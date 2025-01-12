import java.util.*;

public class LinkedListComponents {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        while (head != null) {
            if (set.contains(head.val)) {
                res++;
                head = head.next;
                while (head != null && set.contains(head.val)) {
                    head = head.next;
                }
            }
            if (head != null) {
                head = head.next;
            }
        }
        return res;
    }
}
