public class SortingTheSentence {
    public String sortSentence(String s) {
        String str[] = new String[s.split(" ").length];
        for (String ch : s.split(" ")) {
            int index = ch.charAt(ch.length() - 1) - 1 - 48;
            str[index] = ch.substring(0, ch.length() - 1);
        }
        StringBuilder result = new StringBuilder();
        result.append(str[0]);
        for (int i = 1; i < str.length; i++) {
            result.append(" ").append(str[i]);
        }
        return result.toString();
    }
}
