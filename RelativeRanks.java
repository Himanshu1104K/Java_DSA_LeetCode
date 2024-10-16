
import java.util.*;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> sortedL = new ArrayList<>();
        for (int sc : score) {
            sortedL.add(sc);
        }
        Collections.sort(sortedL, Collections.reverseOrder());
        int i = 0;
        String[] ans = new String[score.length];
        for (int sc : score) {
            int ind = sortedL.indexOf(sc);
            if (ind == 1) {
                ans[i] = "Gold Medal";
            } else if (ind == 2) {
                ans[i] = "Silver Medal";
            } else if (ind == 3) {
                ans[i] = "Bronze Medal";
            } else {
                ans[i] = Integer.toString(ind);
            }
            i++;
        }
        return ans;
    }
}
