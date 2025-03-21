public class SubstringOfLength3WithDistinctChar {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        if (n < 3) {
            return 0;
        }
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i - 1)
                    && s.charAt(i - 1) != s.charAt(i + 1)) {
                ans++;
            }
        }
        return ans;
    }
}