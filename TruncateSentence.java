public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        if (k == 0) {
            return "";
        }
        String str[] = s.split(" ");
        StringBuilder result = new StringBuilder();
        result.append(str[0]);
        
        for (int i = 1; i < k; i++) {
            result.append(" ").append(str[i]);
        }
        return result.toString();
    }
}
