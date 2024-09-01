import java.util.*;

public class TopKfreqWords {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String str : words) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        PriorityQueue<PriorityString> pq = new PriorityQueue<>();
        for (String str : map.keySet()) {
            pq.offer(new PriorityString(str, map.get(str)));
        }

        for (int i = 1; i <= k; i++) {
            result.add(pq.poll().toString());
        }

        return result;
    }

    public static void main(String[] args) {

    }
}

class PriorityString implements Comparable<PriorityString> {
    String str;
    int priority;

    public PriorityString(String str, int priority) {
        this.str = str;
        this.priority = priority;
    }

    @Override
    public int compareTo(PriorityString other) {
        // Higher priority comes first
        if (this.priority == other.priority) {
            // Lexicographically smaller string should come first
            return this.str.compareTo(other.str);
        } else {
            // Higher priority comes first
            return Integer.compare(other.priority, this.priority);
        }
    }

    @Override
    public String toString() {
        return str;
    }
}