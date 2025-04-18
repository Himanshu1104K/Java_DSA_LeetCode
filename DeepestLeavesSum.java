import java.util.*;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        int ans = 0, i;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            for (i = q.size() - 1, ans = 0; i >= 0; i--) {
                TreeNode node = q.poll();
                ans += node.val;
                if (node.right != null)
                    q.add(node.right);
                if (node.left != null)
                    q.add(node.left);
            }
        }
        return ans;
    }
}
