public class ReverseOddLevelOfBinaryTree {
    public TreeNode reverseOddLevels(TreeNode root) {
        levelNode(root.left, root.right, 0);
        return root;
    }

    public void levelNode(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) {
            return;
        }

        if (level % 2 == 0) {
            int val = left.val;
            left.val = right.val;
            right.val = val;
        }

        levelNode(left.left, right.right, level + 1);
        levelNode(left.right, right.left, level + 1);
    }
}
