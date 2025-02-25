public class NumOfSubArrWIthOddSum {
    public int numOfSubarrays(int[] arr) {
        int odd = 0, even = 1;
        final int mod = 1000000007;
        int cur = 0, result = 0;

        for (int num : arr) {
            cur += num;
            if (cur % 2 == 0) {
                result = (result + odd) % mod;
                even++;
            } else {
                result = (result + even) % mod;
                odd++;
            }
        }

        return result;
    }
}