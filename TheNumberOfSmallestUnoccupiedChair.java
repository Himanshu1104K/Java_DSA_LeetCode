import java.util.*;

public class TheNumberOfSmallestUnoccupiedChair {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        Integer order[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            order[i] = i;
        }
        Arrays.sort(order, (a, b) -> Integer.compare(times[a][0], times[b][0]));

        PriorityQueue<Integer> emptySeat = new PriorityQueue<>();
        PriorityQueue<int[]> takenSeats = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            emptySeat.offer(i);
        }

        for (int i : order) {
            int arrival = times[i][0];
            int leave = times[i][1];

            while (!takenSeats.isEmpty() && takenSeats.peek()[0] >= arrival) {
                emptySeat.offer(takenSeats.poll()[1]);
            }

            int seat = emptySeat.poll();

            if (i == targetFriend) {
                return seat;
            }

            takenSeats.offer(new int[] { leave, seat });

        }

        return -1;
    }
}
