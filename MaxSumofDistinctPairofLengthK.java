import java.util.*;

public class MaxSumofDistinctPairofLengthK {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxSum = 0;
        long curSum = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            int num = nums[j];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            curSum += num;

            if (j - i + 1 > k) {
                int leftNum = nums[i];
                curSum -= leftNum;
                freqMap.put(leftNum, freqMap.getOrDefault(leftNum, 0) - 1);
                if (freqMap.get(leftNum) == 0) {
                    freqMap.remove(leftNum);
                }
                i++;
            }

            if (j - i + 1 == k && freqMap.size() == k) {
                maxSum = Math.max(maxSum, curSum);
            }

        }
        return maxSum;
    }
}