
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        if (nums.length < 3) {
            return l1;
        }
        // for (int i = 0; i < nums.length - 2; i++) {
        //     for (int j = i + 1; j < nums.length - 1; j++) {
        //         for (int k = j + 1; k < nums.length; k++) {
        //             if (i != j && j != k && i != k) {
        //                 int res = nums[i] + nums[j] + nums[k];
        //                 if (res == 0) {
        //                     List<Integer> temp = new ArrayList<>();
        //                     temp.add(nums[i]);
        //                     temp.add(nums[j]);
        //                     temp.add(nums[k]);
        //                     l1.add(temp);
        //                 }
        //             }
        //         }
        //     }
        // }

        Arrays.sort(nums);
        
        return l1;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
