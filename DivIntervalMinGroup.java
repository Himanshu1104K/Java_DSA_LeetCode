import java.util.*;

public class DivIntervalMinGroup {
    public static int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int[] interval : intervals) {
            if (!heap.isEmpty() && heap.peek() < interval[0]) {
                heap.poll();
            }
            heap.offer(interval[1]);
        }

        return heap.size();
    }

    public static void main(String[] args) {
        int x = minGroups(new int[][] { { 5, 10 }, { 6, 8 }, { 1, 5 }, { 2, 3 }, { 1, 10 } });
        System.out.println(x);
    }
}