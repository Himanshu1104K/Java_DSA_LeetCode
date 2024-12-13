public class SmallestNumberWithSetBits {
    public int smallestNumber(int n) {
        int result = 0;
        int i = 0;
        while (n != 0) {
            result += Math.pow(2, i++);
            n = n >> 1;
        }
        return result;
    }
}
