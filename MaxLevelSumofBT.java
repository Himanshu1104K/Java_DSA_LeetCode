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

public class MaxLevelSumofBT {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        Map<Integer, Long> map = new TreeMap<>();
        qu.add(root);
        int i = 1;
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
            map.put(i++, sum);
        }

        Long max = Long.MIN_VALUE;
        int result = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }
        return result;
    }
}
