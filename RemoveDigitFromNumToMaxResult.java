public class RemoveDigitFromNumToMaxResult {
    public String removeDigit(String number, char digit) {
        String result = "";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String cur = number.substring(0, i) + number.substring(i + 1);
                result = (result.compareTo(cur) > 0) ? result : cur;
            }
        }
        return result;
    }
}
