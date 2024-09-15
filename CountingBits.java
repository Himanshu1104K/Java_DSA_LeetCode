
public class CountingBits {

    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int out = 0;
            int num = i;
            while (num != 0) {
                int bit = num & 1;
                if (bit != 0) {
                    out++;
                }
                num /= 10;
            }
            result[i] = out;
        }
        return result;
    }
}
