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

public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        pathSumHelper(root, targetSum, result, new ArrayList<>());
        return result;
    }

    public void pathSumHelper(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> curList) {
        if (root == null) {
            return;
        }

        curList.add(root.val);
        if (root.left == null && root.right == null && targetSum == root.val) {
            result.add(new ArrayList<>(curList));
        } else {
            pathSumHelper(root.left, targetSum - root.val, result, curList);
            pathSumHelper(root.right, targetSum - root.val, result, curList);
        }
        curList.remove(curList.size() - 1);
    }
}
