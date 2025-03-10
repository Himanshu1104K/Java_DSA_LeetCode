public class NumberOfChangingKeys {
    public int countKeyChanges(String s) {
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == s.charAt(i - 1) || (ch - 32) == s.charAt(i - 1) || (ch + 32) == s.charAt(i - 1)) {
            } else {
                result++;
            }
        }
        return result;
    }
}