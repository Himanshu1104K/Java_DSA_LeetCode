import java.util.*;

public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        treePathHelper(root, result, new StringBuilder());
        return result;
    }

    public void treePathHelper(TreeNode root, List<String> result, StringBuilder res) {
        if (root == null) {
            return;
        }
        if (res.length() != 0) {
            res.append("->");
        }
        res.append(root.val);
        if (root.left == null && root.right == null) {
            result.add(res.toString());
        } else {
            treePathHelper(root.left, result, new StringBuilder(res));
            treePathHelper(root.right, result, new StringBuilder(res));
        }
    }

    public static void main(String[] args) {

    }
}

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
