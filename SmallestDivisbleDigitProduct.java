public class SmallestDivisbleDigitProduct {
    public int smallestNumber(int n, int t) {
        for (int i = n; i <= (n + 10); i++) {
            int num = i;
            int prod = 1;
            while (num != 0) {
                int bit = num % 10;
                prod *= bit;
                num = num / 10;
            }

            if (prod % t == 0) {
                return i;
            }
        }
        return -1;
    }
}