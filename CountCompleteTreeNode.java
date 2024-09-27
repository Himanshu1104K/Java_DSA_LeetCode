
public class CountCompleteTreeNode {

    int count = 0;

    public int countNodes(TreeNode root) {
        countNodesHelper(root);
        return count;
    }

    public void countNodesHelper(TreeNode root) {
        if (root == null) {
            return;
        }

        count++;
        countNodesHelper(root.left);
        countNodesHelper(root.right);
    }
}
