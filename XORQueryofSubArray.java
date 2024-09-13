
public class XORQueryofSubArray {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] ^ arr[i];
        }
        int[] result = new int[queries.length];
        int i = 0;
        for (var query : queries) {
            int left = query[0];
            int right = query[1];
            if (left == 0) {
                result[i] = pre[right];
            } else {
                result[i] = pre[right] ^ pre[left - 1];
            }
            i++;
        }
        return result;
    }
}
