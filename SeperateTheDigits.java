import java.util.*;

public class SeperateTheDigits {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            String number = Integer.toString(num);
            for (char ch : number.toCharArray()) {
                list.add((ch - '0'));
            }
        }
        int n = list.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
