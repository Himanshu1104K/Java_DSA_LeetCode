public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        for (int val : arr) {
            if (val == 0)
                zeros++;
        }

        int i = n - 1;
        int j = n + zeros - 1;

        while (i >= 0 && j >= 0) {
            if (j < n) {
                arr[j] = arr[i];
            }

            if (arr[i] == 0) {
                j--;
                if (j < n) {
                    arr[j] = 0;
                }
            }
            j--;
            i--;
        }
    }
}