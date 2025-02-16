public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);

    }

    private TreeNode buildTree(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }

        int maxIndex = findMaxIndex(nums, l, r);
        TreeNode root = new TreeNode(nums[maxIndex]);

        root.left = buildTree(nums, l, maxIndex - 1);
        root.right = buildTree(nums, maxIndex + 1, r);

        return root;
    }

    private int findMaxIndex(int[] nums, int l, int r) {
        int maxIndex = l;
        for (int i = l; i <= r; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

// public TreeNode constructMaximumBinaryTree(int[] nums) {
// return divide(nums, 0, nums.length - 1);
// }

// public TreeNode divide(int[] nums, int l, int r) {
// if (l == r)
// return new TreeNode(nums[l]);

// int mid = l + (r - l) / 2;
// TreeNode left_sub = divide(nums, l, mid);
// TreeNode right_sub = divide(nums, mid + 1, r);
// return merge(left_sub, right_sub);
// }

// public TreeNode merge(TreeNode left_sub, TreeNode right_sub) {
// TreeNode iterator;
// if (left_sub.val > right_sub.val) {
// iterator = left_sub;

// while (iterator.right != null && iterator.right.val > right_sub.val) {
// iterator = iterator.right;
// }

// if (iterator.right != null) {
// TreeNode temp_left = iterator.right;
// iterator.right = right_sub;
// merge(temp_left, right_sub);
// } else {
// iterator.right = right_sub;
// }
// return left_sub;
// } else {
// iterator = right_sub;

// while (iterator.left != null && iterator.left.val > left_sub.val) {
// iterator = iterator.left;
// }

// if (iterator.left != null) {
// TreeNode temp_right = iterator.left;
// iterator.left = left_sub;
// merge(left_sub, temp_right);
// } else {
// iterator.left = left_sub;
// }
// return right_sub;
// }
// }
// }