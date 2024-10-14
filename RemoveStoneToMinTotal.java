
import java.util.*;

public class RemoveStoneToMinTotal {

    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int total = 0;
        for (int pile : piles) {
            pq.offer(pile);
            total += pile;
        }

        for (int i = 1; i <= k; i++) {
            int num = pq.poll();
            int remStone = num - Math.floorDiv(num, 2);
            pq.offer(remStone);
            total -= Math.floorDiv(num, 2);
        }
        return total;
    }
}
