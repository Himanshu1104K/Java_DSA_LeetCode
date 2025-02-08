public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] res = s.toCharArray();
        int n = indices.length;
        for (int i = 0; i < n; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return String.valueOf(res);
    }
}
