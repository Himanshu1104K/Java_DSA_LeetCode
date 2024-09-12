public class MinBitFlipToConvert {
    public int minBitFlips(int start, int goal) {
        int bit = (start ^ goal);
        int result = 0;
        while (bit != 0) {
            if ((bit & 1) == 1) {
                result++;
            }
            bit = (bit >> 1);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}