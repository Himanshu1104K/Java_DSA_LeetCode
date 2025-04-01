public class CountAstericks {
    public int countAsterisks(String s) {
        int ans = 0;
        boolean pair = false;
        for (char ch : s.toCharArray()) {
            if (ch == '|') {
                pair = !pair;
            }

            if (!pair) {
                if (ch == '*') {
                    ans++;
                }
            }
        }
        return ans;
    }
}
