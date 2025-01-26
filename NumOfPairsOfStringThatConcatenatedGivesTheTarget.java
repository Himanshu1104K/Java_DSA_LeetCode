public class NumOfPairsOfStringThatConcatenatedGivesTheTarget {
    public int numOfPairs(String[] nums, String target) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            String num1 = nums[i];
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    String num2 = nums[j];
                    String key = num1.concat(num2);
                    if (key.equals(target)) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}
