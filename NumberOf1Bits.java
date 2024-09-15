
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            int bit = n & 1;
            if (bit != 0) {
                result++;
            }
            n = n >> 1;
        }
        return result;
    }
}
