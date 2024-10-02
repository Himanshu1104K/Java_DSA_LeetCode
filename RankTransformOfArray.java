import java.util.*;

public class RankTransformOfArray {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        Object temp[] = set.toArray();
        Arrays.sort(temp);
        int x = 1;
        Map<Integer, Integer> rank = new HashMap<>();
        for (var val : temp) {
            rank.put((int) val, x++);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }

        return arr;
    }
}