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

public class MaximumDepthOfBinaryTree {
    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root, 0);
        return maxDepth;
    }

    public void helper(TreeNode root, int curDepth) {
        if (root == null)
            return;

        curDepth++;
        maxDepth = Integer.max(maxDepth, curDepth);
        helper(root.left, curDepth);
        helper(root.right, curDepth);
    }
}
