import java.util.*;

public class FindElements {
    Set<Integer> set;

    public FindElements(TreeNode root) {
        set = new HashSet<>();

        getAllElement(set, root, 0);
    }

    public boolean find(int target) {
        return set.contains(target);
    }

    public void getAllElement(Set<Integer> set, TreeNode root, int prev) {
        if (root == null) {
            return;
        }

        set.add(prev);
        getAllElement(set, root.left, prev * 2 + 1);
        getAllElement(set, root.right, prev * 2 + 2);
    }
}