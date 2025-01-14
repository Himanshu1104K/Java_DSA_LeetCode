public class PrefixCommonArrayOfTwoArray {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            int x = A[i] - 1;
            int y = B[i] - 1;
            freq[x]++;
            freq[y]++;
            if (x == y) {
                ans[i] = i > 0 ? ans[i - 1] + 1 : 1;
            } else if (freq[x] == 2 && freq[y] == 2) {
                ans[i] = i > 0 ? ans[i - 1] + 2 : 2;
            } else if (freq[x] == 2 || freq[y] == 2) {
                ans[i] = i > 0 ? ans[i - 1] + 1 : 1;
            } else {
                ans[i] = i > 0 ? ans[i - 1] : 0;
            }
        }
        return ans;
    }
}