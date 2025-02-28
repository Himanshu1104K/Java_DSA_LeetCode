import java.util.*;

public class ConstructBinaryTreeFromDescription {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> childs = new HashSet<>();
        Map<Integer, int[]> childrenMap = new HashMap<>();

        for (int[] desc : descriptions) {
            int parent = desc[0];
            int child = desc[1];
            int isLeft = desc[2];

            childrenMap.putIfAbsent(parent, new int[] { -1, -1 });
            childs.add(child);

            if (isLeft == 1) {
                childrenMap.get(parent)[0] = child;
            } else {
                childrenMap.get(parent)[1] = child;
            }
        }

        int headNodeVal = 0;
        for (int key : childrenMap.keySet()) {
            if (!childs.contains(key)) {
                headNodeVal = key;
                break;
            }
        }

        return constructTree(headNodeVal, childrenMap);
    }

    public TreeNode constructTree(int root, Map<Integer, int[]> childrenMap) {
        TreeNode newNode = new TreeNode(root);
        if (childrenMap.containsKey(root)) {
            int[] childrens = childrenMap.get(root);
            if (childrens[0] != -1) {
                newNode.left = constructTree(childrens[0], childrenMap);
            }
            if (childrens[1] != -1) {
                newNode.right = constructTree(childrens[1], childrenMap);
            }
        }
        return newNode;
    }
}
