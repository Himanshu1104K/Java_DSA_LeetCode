public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int[] account : accounts) {
            int cur = 0;
            for (int wealth : account) {
                cur += wealth;
            }
            ans = Math.max(cur, ans);
        }
        return ans;
    }
}