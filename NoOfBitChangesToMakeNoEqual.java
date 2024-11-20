public class NoOfBitChangesToMakeNoEqual {
    public int minChanges(int n, int k) {
        if (n == k) {
            return 0;
        }
        int result = 0;
        while (n != 0) {
            int nBit = (n & 1);
            int kBit = (k & 1);
            if (nBit == 0 && kBit == 1) {
                return -1;
            } else if (nBit == 1 && kBit == 0) {
                result++;
            }

            n = n >> 1;
            k = k >> 1;
        }
        return result;
    }
}
