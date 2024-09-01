public class CommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Integer.min(minLen, str.length());
        }
        if (minLen == 0) {
            return "";
        }
        StringBuilder Out = new StringBuilder();
        int iter = 0;
        outerLoop: while (iter<minLen) {
            char ch = ' ';
            for (int i = 1; i < strs.length; i++) {
                ch = strs[i].charAt(iter);
                if (ch == strs[i - 1].charAt(iter)) {
                } else {
                    break outerLoop;
                }
            }
            Out.append(ch);
            iter++;
        }
        return Out.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] { "ab", "a" }));
    }
}