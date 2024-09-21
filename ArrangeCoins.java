public class ArrangeCoins {
    public int arrangeCoins(int n) {
        int result = 0;
        int prevSum = 1;
        while (n >= 0) {
            result++;
            n -= prevSum;
            prevSum++;
        }

        return result;
    }
}
