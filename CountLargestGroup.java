import java.util.*;

public class CountLargestGroup {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
            max = Math.max(max, map.get(sum));
        }

        int res = 0;

        for (int val : map.values()) {
            if (val == max) {
                res++;
            }
        }

        return res;
    }
}