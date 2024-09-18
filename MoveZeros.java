import java.util.*;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int[] newNum = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                newNum[i++] = num;
            }
        }
        i = 0;
        for (int num : newNum) {
            nums[i++] = num;
        }
    }
}