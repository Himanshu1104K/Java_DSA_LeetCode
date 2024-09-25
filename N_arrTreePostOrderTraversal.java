import java.util.ArrayList;
import java.util.List;

public class N_arrTreePostOrderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    public void postorderHelper(Node root, List<Integer> result) {
        if (root == null)
            return;
        for (Node children : root.children) {
            postorderHelper(children, result);
        }
        result.add(root.val);
    }
}
