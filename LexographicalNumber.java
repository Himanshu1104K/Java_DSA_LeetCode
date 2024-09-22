import java.util.*;

public class LexographicalNumber {
    public List<Integer> lexicalOrder(int n) {
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
        for (int i = 1; i <= n; i++) {
            pq.offer(Integer.toString(i));
        }
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            result.add(Integer.valueOf(pq.poll()));
        }

        return result;
    }
}
