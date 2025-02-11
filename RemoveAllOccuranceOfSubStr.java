public class RemoveAllOccuranceOfSubStr {
    public String removeOccurrences(String s, String part) {
        StringBuilder ans = new StringBuilder(s);
        int n = part.length();
        while (ans.indexOf(part) != -1) {
            int start = ans.indexOf(part);
            ans.delete(start, n + start);
        }
        return ans.toString();
    }
}