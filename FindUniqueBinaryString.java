import java.util.*;

public class FindUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> allStr = new HashSet<>();
        int n = nums[0].length();
        generateString(n, new StringBuilder(), allStr);
        for (String num : nums) {
            if (allStr.contains(num)) {
                allStr.remove(num);
            }
        }
        return allStr.isEmpty() ? "" : allStr.toArray(String[]::new)[0];
    }

    public void generateString(int n, StringBuilder cur, Set<String> allStr) {
        if (cur.length() == n) {
            allStr.add(new String(cur));
            return;
        }

        cur.append('0');
        generateString(n, cur, allStr);
        cur.deleteCharAt(cur.length() - 1);

        cur.append('1');
        generateString(n, cur, allStr);
        cur.deleteCharAt(cur.length() - 1);
    }
}