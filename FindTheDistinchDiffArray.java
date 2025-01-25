import java.util.*;

public class FindTheDistinchDiffArray {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        Set<Integer> PrefixSet = new HashSet<>();
        Set<Integer> SuffixSet = new HashSet<>();

        int[] pref = new int[n];
        int[] suff = new int[n];

        for (int i = 0; i < n; i++) {
            PrefixSet.add(nums[i]);
            pref[i] = PrefixSet.size();
        }

        for (int i = n - 1; i >= 0; i--) {
            SuffixSet.add(nums[i]);
            suff[i] = SuffixSet.size();
        }

        int[] diff = new int[n];

        for (int i = 0; i < n; i++) {
            int suffixDistinct = (i + 1 < n) ? suff[i + 1] : 0;
            diff[i] = pref[i] - suffixDistinct;
        }

        return diff;
    }
}
