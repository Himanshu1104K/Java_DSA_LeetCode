public class TreeTraversal {
    public void inOrder(TreeNode root) {
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.val+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        this.val = x;
    }
}