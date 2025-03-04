import java.util.*;

public class BeautifulArray {
    public int[] beautifulArray(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        while (result.size() < n) {
            List<Integer> temp = new ArrayList<>();

            for (int i : result) {
                if (i * 2 - 1 <= n) {
                    temp.add(i * 2 - 1);
                }
            }
            for (int i : result) {
                if (i * 2 <= n) {
                    temp.add(i * 2);
                }
            }
            result = temp;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
