public class NumberOfDigitOne {
    public static int countDigitOne(int n) {
        if (n <= 1) {
            return n;
        }
        int result = 0;
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int m = i;
            while (m != 0) {
                int bit = m % 10;
                if (bit == 1) {
                    count++;
                }
                m = m / 10;
            }
            result += count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countDigitOne(99));
    }
}
