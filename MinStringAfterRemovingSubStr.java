public class MinStringAfterRemovingSubStr {
    public int minLength(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        while (i < str.length() - 1) {
            if ((str.charAt(i) == 'C' && str.charAt(i + 1) == 'D')
                    || (str.charAt(i) == 'A' && str.charAt(i + 1) == 'B')) {
                str.delete(i, i + 2);
                i = Math.max(i - 1, 0);
            } else {
                i++;
            }
        }
        return str.length();
    }
}
// if ((str.charAt(i) == 'C' && str.charAt(i + 1) == 'D') || (str.charAt(i) ==
// 'A' && str.charAt(i + 1) ==
// 'B')) {
// str.charAt(i) = '_';
// str.charAt(i + 1) = '_';
// i--;
// }