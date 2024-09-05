import java.util.*;

public class TopKFreqElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        PriorityQueue<PriorityInt> pq = new PriorityQueue<>();
        for (int num : map.keySet()) {
            pq.add(new PriorityInt(num, map.get(num)));
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = Integer.parseInt(pq.poll().toString());
        }
        return result;
    }
}

class PriorityInt implements Comparable<PriorityInt> {
    int value;
    int priority;

    public PriorityInt(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    @Override
    public int compareTo(PriorityInt other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

}