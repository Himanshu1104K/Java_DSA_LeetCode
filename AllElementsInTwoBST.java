import java.util.*;

public class AllElementsInTwoBST {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        getAllElementsHelper(root1, result);
        getAllElementsHelper(root2, result);
        Collections.sort(result);
        return result;
    }

    public void getAllElementsHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);
        getAllElementsHelper(root.left, result);
        getAllElementsHelper(root.right, result);
    }
}
