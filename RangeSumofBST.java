public class RangeSumofBST {
    int result = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;

        int x = root.val;
        if (x >= low && x <= high) {
            result += x;
        }
        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);
        return result;
    }
}
