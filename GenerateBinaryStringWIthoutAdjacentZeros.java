import java.util.*;

public class GenerateBinaryStringWIthoutAdjacentZeros {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        validStringHelper(n, result, new StringBuilder(), -1);
        return result;
    }

    public void validStringHelper(int n, List<String> result, StringBuilder cur, int last) {
        if (cur.length() == n) {
            result.add(cur.toString());
            return;
        }

        cur.append('1');
        validStringHelper(n, result, cur, 1);
        cur.deleteCharAt(cur.length() - 1);

        if (last != 0) {
            cur.append('0');
            validStringHelper(n, result, cur, 0);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}