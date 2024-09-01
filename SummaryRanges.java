import java.util.*;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            StringBuilder temp = new StringBuilder();
            temp.append(nums[i]);
            if (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                temp.append("->");
                while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                    i++;
                }
                temp.append(nums[i]);
            }
            result.add(temp.toString());
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        summaryRanges(new int[] { 0, 2, 3, 4, 6, 8, 9 });
        summaryRanges(new int[] { 0, 1, 2, 4, 5, 7 });
    }
}
