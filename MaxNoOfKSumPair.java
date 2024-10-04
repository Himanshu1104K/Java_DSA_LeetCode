import java.util.*;

public class MaxNoOfKSumPair {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int operation = 0;
        for (int n : nums) {
            int kn = k - n;
            if (freq.getOrDefault(n, 0) > 0 && freq.getOrDefault(kn, 0) > 0) {
                if (n == kn) {
                    int fn = freq.get(n);
                    if (fn >= 2) {
                        operation++;
                        freq.put(n, fn - 2);
                    }
                } else {
                    operation++;
                    freq.put(kn, freq.get(kn) - 1);
                    freq.put(n, freq.get(n) - 1);
                }

            }
        }
        return operation;
    }
}
