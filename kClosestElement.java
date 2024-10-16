import java.util.*;

public class kClosestElement {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int diff1 = Math.abs(b - x);
            int diff2 = Math.abs(a - x);
            if (diff1 != diff2) {
                return diff1 - diff2;
            } else {
                return b - a;
            }
        });
        for (int i : arr) {
            pq.offer(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        ArrayList<Integer> result = new ArrayList<>(pq);
        Collections.sort(result);
        return result;
    }
}
