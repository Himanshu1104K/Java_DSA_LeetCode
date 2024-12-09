public class SpecialArray2 {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        boolean[] special = new boolean[n - 1];
        int[] prefix = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 != 0) || (nums[i] % 2 != 0 && nums[i + 1] % 2 == 0)) {
                special[i] = true;
            } else {
                special[i] = false;
            }

            prefix[i + 1] = prefix[i] + (special[i] ? 1 : 0);
        }

        boolean[] result = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            result[i] = (prefix[r] - prefix[l] == r - l);
        }

        return result;
    }
}