import java.util.Arrays;

public class MiniMizMaxPairSum {
    public int minPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int x = 0;
        int y = nums.length - 1;
        while (x < y) {
            int curPairSum = nums[x] + nums[y];
            max = Math.max(max, curPairSum);
            x++;
            y--;
        }
        return max;
    }
}
