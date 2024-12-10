public class Largest3DigitNumInString {
    public String largestGoodInteger(String num) {
        String max = "";
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                String cur = num.substring(i, i + 3);
                max = (cur.compareTo(max) < 0) ? max : cur;
            }
        }
        return max;
    }
}
