
public class LexoSmallStringAfterSwap {
    public static String getSmallestString(String s) {
        String smallest = s;
        char ch[] = s.toCharArray();
        for (int i = 1; i < ch.length; i++) {

            if ((ch[i] % 2 == 0 && ch[i - 1] % 2 == 0)
                    || (ch[i] % 2 != 0 && ch[i - 1] % 2 != 0)) {
                char temp = ch[i];
                ch[i] = ch[i - 1];
                ch[i - 1] = temp;

                String newString = String.valueOf(ch);
                if (newString.compareTo(smallest) < 0) {
                    smallest = newString;
                }

                temp = ch[i];
                ch[i] = ch[i - 1];
                ch[i - 1] = temp;
            }

        }
        return smallest;
    }

    public static void main(String[] args) {
        getSmallestString("45320");
    }
}