public class DivideTwoInteger {
    public static int divide(int dividend, int divisor) {
        int bit = 1;
        if (dividend < 0) {
            bit *= -1;
            dividend = dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : -dividend;
        }
        if (divisor < 0) {
            bit *= -1;
            divisor = divisor == Integer.MIN_VALUE ? Integer.MAX_VALUE : -divisor;
        }
        if (divisor == 0) {
            return dividend > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (divisor == 1) {
            return bit * dividend;
        }

        int out = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            out++;
        }

        return bit * out;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
