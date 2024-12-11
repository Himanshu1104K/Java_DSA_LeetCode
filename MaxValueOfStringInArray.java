public class MaxValueOfStringInArray {
    public int maximumValue(String[] strs) {
        int result = 0;
        for (String str : strs) {
            boolean isDigit = true;
            for (char ch : str.toCharArray()) {
                if (ch - '0' > 9 || ch - '0' < 0) {
                    isDigit = false;
                    break;
                }
            }

            if (isDigit) {
                result = Math.max(result, Integer.parseInt(str));
            } else {
                result = Math.max(result, str.length());
            }

        }
        return result;
    }
}
