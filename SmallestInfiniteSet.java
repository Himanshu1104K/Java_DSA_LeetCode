import java.util.*;

class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>((a, b) -> a - b);
        for (int i = 1; i <= 1000; i++) {
            pq.offer(i);
        }
    }

    public int popSmallest() {
        return pq.poll();
    }

    public void addBack(int num) {
        if (!pq.contains(num)) {
            pq.add(num);
        }
    }
}