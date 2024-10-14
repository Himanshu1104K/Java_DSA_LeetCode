
import java.util.*;

public class TakeGiftFromRichestPile {

    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        long total = 0;
        for (int gift : gifts) {
            total += gift;
            pq.offer(gift);
        }

        for (int i = 1; i <= k; i++) {
            int num = pq.poll();
            int val = (int) Math.floor(Math.pow(num, 0.5));
            pq.offer(val);
            total -= num - val;
        }

        return total;
    }
}
