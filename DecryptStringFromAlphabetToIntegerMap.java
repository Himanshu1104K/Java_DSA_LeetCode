public class DecryptStringFromAlphabetToIntegerMap {
    public static String freqAlphabets(String s) {
        int n = s.length() - 1;
        StringBuilder ans = new StringBuilder();
        while (n >= 0) {
            int charIdx;
            if (s.charAt(n) == '#') {
                charIdx = Integer.parseInt(s.substring(n - 2, n));
                n -= 3;
            } else {
                charIdx = Integer.parseInt(s.substring(n, n + 1));
                n--;
            }
            char ch = (char) ('a' + charIdx - 1);
            ans.append(ch);
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        freqAlphabets("10#11#12");
    }
}
