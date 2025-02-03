import java.util.*;

public class ConvertAnArrayinto2DArray {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            boolean added = false;
            for (int i = 0; i < result.size(); i++) {
                if (!result.get(i).contains(num)) {
                    result.get(i).add(num);
                    added = true;
                    break;
                }
            }
            if (!added) {
                result.add(new ArrayList<>());
                result.getLast().add(num);
            }
        }
        return result;
    }
}
