
public class MinNoSwapsToStringBalance {
    public static int minSwaps(String s) {
        int ans = 0;
        for (var ch : s.toCharArray()) {
            if (ch == '[') {
                ans++;
            } else if (ans > 0) {
                ans--;
            }
        }
        return (ans + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(minSwaps("]]][[["));
    }
}