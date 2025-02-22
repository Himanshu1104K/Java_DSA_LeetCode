public class RecoverTheTreeFromPreorderTraversal {
    public TreeNode recoverFromPreorder(String traversal) {
        TreeNode[] nodes = new TreeNode[1000];
        int i = 0, n = traversal.length();
        while (i < n && traversal.charAt(i) != '-') {
            i++;
        }
        TreeNode root = new TreeNode(Integer.parseInt(traversal.substring(0, i)));
        nodes[0] = root;

        int D = 0;
        while (i < n) {
            while (i < n && traversal.charAt(i) == '-') {
                D++;
                i++;
            }

            StringBuilder str = new StringBuilder();
            while (i < n && traversal.charAt(i) != '-') {
                str.append(traversal.charAt(i));
                i++;
            }

            TreeNode newNode = new TreeNode(Integer.parseInt(str.toString()));

            int parentD = D - 1;
            TreeNode parent = nodes[parentD];

            if (parent.left == null) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }

            nodes[D] = newNode;
            D = 0;
        }

        return root;
    }
}