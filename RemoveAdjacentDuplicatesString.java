public class RemoveAdjacentDuplicatesString {
    public String removeDuplicates(String s) {
        int i = 0;
        char[] str = s.toCharArray();
        for (int j = 1; j < str.length; j++) {
            if (str[j] != str[j - 1]) {
                str[i] = str[j];
                i++;
            } else {
                i--;
            }
        }
        s = String.valueOf(str);
        return s.substring(0, i);
    }

    public static void main(String[] args) {

    }
}
