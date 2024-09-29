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

public class MinimumDepthOfBinaryTree {
    int minDepth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root, 0);
        return minDepth;
    }

    public void helper(TreeNode root, int curDepth) {
        if (root == null) {
            minDepth = Integer.min(minDepth, curDepth);
            return;
        }

        curDepth++;
        helper(root.left, curDepth);
        helper(root.right, curDepth);
    }
}
