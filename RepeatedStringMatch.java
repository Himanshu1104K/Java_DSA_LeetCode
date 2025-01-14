public class RepeatedStringMatch {
    public static int repeatedStringMatch(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int minRepeat = (bLen / aLen) + 1;
        StringBuilder str = new StringBuilder(a.repeat(minRepeat));
        if (str.toString().contains(b)) {
            return minRepeat;
        }
        str.append(a);
        if (str.toString().contains(b)) {
            return minRepeat + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        repeatedStringMatch("abcd", "cdabcdab");
    }
}
