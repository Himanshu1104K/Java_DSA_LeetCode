
public class StringCompression3 {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int charCount = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(i - 1) || charCount == 9) {
                comp.append(charCount).append(word.charAt(i - 1));
                charCount = 1;
            } else {
                charCount++;
            }
        }
        comp.append(charCount).append(word.charAt(word.length() - 1));
        return comp.toString();
    }
}