public class ConsecutiveChar {
    public int maxPower(String s) {
        int maxPower = 1;
        int len = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                len++;
            } else {
                len = 1;
            }
            maxPower = Math.max(len, maxPower);
        }
        return maxPower;
    }
}
