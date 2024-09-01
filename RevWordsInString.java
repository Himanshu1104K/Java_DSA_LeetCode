public class RevWordsInString {
    public static String reverseWords(String s) {
        if (s.isEmpty()) {
            return "";
        }
        s = s.trim();
        String arr[] = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                str.append(arr[i]);
                break;
            }
            if (!(arr[i].equals(""))) {
                str.append(arr[i]).append(" ");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        reverseWords("a good   example");
    }
}