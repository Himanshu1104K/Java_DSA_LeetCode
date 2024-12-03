public class AddingSpacesToString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int idx = 0;
        int n = spaces.length;
        for (int i = 0; i < s.length(); i++) {
            if (idx < n) {
                if (spaces[idx] == i) {
                    result.append(' ');
                    idx++;
                }
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}