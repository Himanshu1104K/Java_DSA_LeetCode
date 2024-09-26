import java.util.*;

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

public class KthSmallestElementinBST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        kthSmallestHelper(root, list);
        return list.get(k - 1);
    }

    public void kthSmallestHelper(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        kthSmallestHelper(root.left, list);
        list.add(root.val);
        kthSmallestHelper(root.right, list);
    }
}