import java.util.*;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] * 2) || (arr[i] % 2 == 0 && map.containsKey(arr[i] / 2))) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}