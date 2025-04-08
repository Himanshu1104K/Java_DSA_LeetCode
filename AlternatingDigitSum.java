public class AlternatingDigitSum {
    public int alternateDigitSum(int n) {
        String num = Integer.toString(n);
        boolean sign = false;
        int ans = 0;
        for (char ch : num.toCharArray()) {
            int bit = (int) ch - '0';
            if (sign) {
                ans += bit;
            } else {
                ans -= bit;
            }
            sign = !sign;
        }

        return ans;
    }
}
