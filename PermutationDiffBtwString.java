
public class PermutationDiffBtwString {
    public int findPermutationDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < t.length(); i++) {
            result += Math.abs(i - t.indexOf(s.charAt(i)));
        }

        return result;
    }
}
