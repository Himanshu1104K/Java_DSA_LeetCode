public class HashDivideString {
    public String stringHash(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += k) {
            int hashCode = 0;
            for (int j = i; j < s.length() && j < i + k; j++) {
                hashCode += (s.charAt(j) - 97);
            }
            char val = (char) (hashCode % 26 + 97);
            result.append(val);
        }

        return result.toString();
    }
}
