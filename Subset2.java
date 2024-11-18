
import java.util.*;

public class Subset2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, 0);
        List<List<Integer>> finalRes = new ArrayList<>();
        for (List<Integer> val : result) {
            finalRes.add(val);
        }
        return finalRes;
    }

    private void backtrack(Set<List<Integer>> result, List<Integer> templist, int[] nums, int start) {
        result.add(new ArrayList<>(templist));
        for (int i = start; i < nums.length; i++) {
            templist.add(nums[i]);
            backtrack(result, templist, nums, i + 1);
            templist.remove(templist.size() - 1);
        }
    }
}
