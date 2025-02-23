public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {
    int index = 0;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return construct(preorder, postorder, 0, preorder.length - 1);
    }

    public TreeNode construct(int[] preorder, int[] postorder, int l, int h) {
        if (index >= preorder.length || l > h) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[index++]);
        if (l == h) {
            return root;
        }
        int i;
        for (i = l; i <= h; i++) {
            if (postorder[i] == preorder[index])
                break;
        }

        if (l <= h) {
            root.left = construct(preorder, postorder, l, i);
            root.right = construct(preorder, postorder, i + 1, h - 1);
        }
        return root;
    }
}