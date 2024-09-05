public class AddString {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int dig1 = i >= 0 ? (int) (num1.charAt(i) - '0') : 0;
            int dig2 = j >= 0 ? (int) (num2.charAt(j) - '0') : 0;
            int res = carry + dig1 + dig2;
            if (res > 9) {
                result.append(res % 10);
                carry = res / 10;
            } else {
                result.append(res);
                carry = 0;
            }
            i--;
            j--;
        }
        return result.reverse().toString();
    }

        public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
    }
}
