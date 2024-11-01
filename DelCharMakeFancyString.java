public class DelCharMakeFancyString {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        char prev = s.charAt(0);
        int charCount = 0;
        for (char ch : s.toCharArray()) {
            if (prev == ch) {
                charCount++;
            } else {
                charCount = 1;
            }

            if (charCount < 3)
                result.append(ch);
            prev = ch;

        }
        return result.toString();
    }
}