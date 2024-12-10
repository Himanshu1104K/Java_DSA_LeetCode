public class LargestOddNumInString {
    public String largestOddNumber(String num) {
        int right = num.length() - 1;
        while ((num.charAt(right) - '0') % 2 == 0) {
            right--;
        }
        if (right == 0) {
            return "";
        } else {
            return num.substring(0, right + 1);
        }
    }
}
