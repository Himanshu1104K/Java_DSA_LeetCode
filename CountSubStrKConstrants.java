public class CountSubStrKConstrants {
    public int countKConstraintSubstrings(String s, int k) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                int zero = 0;
                int one = 0;
                int bit = 0;
                for (char ch : str.toCharArray()) {
                    if (one > k || zero > k) {
                        bit = 1;
                        break;
                    }
                    if (ch == '0')
                        zero++;
                    else
                        one++;
                }
                if (bit == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
