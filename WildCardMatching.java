public class WildCardMatching {
    public static boolean isMatch(String s, String p) {
        int i = 0;
        while (p.charAt(i) == '*') {
            i++;
        }
        if (i == p.length()) {
            return true;
        }
        if (s.isEmpty()) {
            return p.isEmpty();
        }
        i = 0;
        int j = 0;
        while (i < s.length() && j < p.length()) {
            if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
                i++;
                j++;
            } else if (p.charAt(j) == '*') {
                while (i < s.length()) {
                    if ((j + 1 < p.length() && s.charAt(i) == p.charAt(j + 1))) {
                        break;
                    }
                    i++;
                }
                j++;
            } else
                return false;
        }

        return (i == s.length()) && (j == p.length());
    }

    public static void main(String[] args) {
        System.out.println(isMatch("adceb", "*a*b"));
    }
}