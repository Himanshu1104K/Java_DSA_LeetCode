public class ReplaceAllDigitsWithCharacter {
    public String replaceDigits(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(s.charAt(i));
            } else {
                char ch = (char) (s.charAt(i - 1) + (s.charAt(i) - '0'));
                result.append(ch);
            }
        }

        return result.toString();
    }
}
