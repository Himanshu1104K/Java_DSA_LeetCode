
import java.util.*;

public class LengthOfLongestFibonaciSubseq {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int a = arr[i], b = arr[j];
                int length = 2;
                while (set.contains(a + b)) {
                    int tem = a + b;
                    a = b;
                    b = tem;
                    length++;
                }
                res = Math.max(res, length);
            }
        }
        return res >= 3 ? res : 0;
    }
}