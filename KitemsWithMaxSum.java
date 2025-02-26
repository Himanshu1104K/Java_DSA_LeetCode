public class KitemsWithMaxSum {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ans = 0;
        ans += numOnes <= k ? numOnes : k;
        k = k - numOnes;
        if (k > 0) {
            k = k - numZeros;
            if (k > 0) {
                ans -= numNegOnes <= k ? numNegOnes : k;
            }
        }
        return ans;
    }
}
