public class BinaryNoAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int prevBit = n & 1;
        n = n >> 1;
        while (n != 0) {
            int bit = n & 1;
            if (bit == prevBit) {
                return false;
            }
            prevBit = bit;
            n = n >> 1;
        }
        return true;
    }
}
