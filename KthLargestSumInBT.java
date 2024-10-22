import java.util.*;

// Definition for a binary tree node.
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

public class KthLargestSumInBT {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Queue<TreeNode> qu = new LinkedList<>();

        qu.add(root);
        while (!qu.isEmpty()) {
            int size = qu.size();
            long sum = 0;
            while (size != 0) {
                TreeNode temp = qu.poll();
                sum += temp.val;
                if (temp.left != null)
                    qu.add(temp.left);
                if (temp.right != null)
                    qu.add(temp.right);
                size--;
            }
            pq.add(sum);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.size() < k ? -1 : pq.peek();
    }
}
