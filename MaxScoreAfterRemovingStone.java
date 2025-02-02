import java.util.*;

public class MaxScoreAfterRemovingStone {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int score = 0;
        while (pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            score++;
            if (x - 1 > 0) {
                pq.offer(x - 1);
            }
            if (y - 1 > 0) {
                pq.offer(y - 1);
            }
        }

        return score;
    }
}
