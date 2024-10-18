import java.util.*;

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

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        for (ListNode cur = head; cur != null; cur = cur.next) {
            nums.add(cur.val);
        }
        return CreateBST(nums, 0, nums.size() - 1);
    }

    public TreeNode CreateBST(List<Integer> head, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(head.get(mid));
        root.left = CreateBST(head, l, mid - 1);
        root.right = CreateBST(head, mid + 1, r);

        return root;
    }
}
