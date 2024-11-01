public class SplitStringBalanceString {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int result = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'L')
                balance++;
            else
                balance--;

            if (balance == 0) {
                result++;
            }
        }
        return result;
    }
}
