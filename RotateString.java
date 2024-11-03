
public class RotateString {
    public static boolean rotateString(String s, String goal) {
        int n = s.length();
        if (n != goal.length()) {
            return false;
        }

        int i = 0;
        for (; i < n; i++) {
            if (s.charAt(i) == goal.charAt(0)) {
                if (s.substring(i).equals(goal.substring(n - i))) {
                    break;
                }
            }
        }

        int length = 0, j = 0;
        while (length < n && s.charAt(i % n) == goal.charAt(j)) {
            length++;
            i++;
            j++;
        }

        return j == n;
    }

}