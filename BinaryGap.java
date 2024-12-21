public class BinaryGap {
    public int binaryGap(int n) {
        int gap = 0;
        int curGap = 0;
        boolean lastPos = false;
        while (n != 0) {
            int bit = n & 1;
            if (bit == 1) {
                if (lastPos) {
                    gap = Math.max(gap, curGap);
                } else {
                    lastPos = true;
                }
                curGap = 1;
            } else {
                curGap++;
            }
            n >>= 1;
        }
        return gap;
    }
}