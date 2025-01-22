import java.util.*;

public class TheKthLexoGraphicalHappyString {
    public static String getHappyString(int n, int k) {
        List<String> happy = new ArrayList<>();
        genHappyString(n, happy, new StringBuilder(), ' ');
        Collections.sort(happy);
        if (happy.size() < k) {
            return "";
        } else {
            return happy.get(k - 1);
        }
    }

    public static void genHappyString(int n, List<String> happy, StringBuilder str, char lastChr) {
        if (str.length() == n) {
            happy.add(str.toString());
            return;
        }

        for (char ch : new char[] { 'a', 'b', 'c' }) {
            if (ch != lastChr) {
                str.append(ch);
                genHappyString(n, happy, str, ch);
                str.deleteCharAt(str.length() - 1);
            }
        }

    }

    public static void main(String[] args) {
        getHappyString(3, 9);
    }
}
