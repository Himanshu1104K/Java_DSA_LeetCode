import java.util.*;

class PriorityChar implements Comparable<PriorityChar> {
    char character;
    int priority;

    public PriorityChar(char character, int priority) {
        this.character = character;
        this.priority = priority;
    }

    @Override
    public int compareTo(PriorityChar other) {
        // Higher priority comes first
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return Character.toString(character).repeat(priority);
    }
}

public class SortCharByFreq {
    public String frequencySort(String s) {
        if (s.length() <= 1) {
            return s;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        PriorityQueue<PriorityChar> pq = new PriorityQueue<>();
        for (char ch : map.keySet()) {
            pq.offer(new PriorityChar(ch, map.get(ch)));
        }
        StringBuilder str = new StringBuilder();
        while (!pq.isEmpty()) {
            str.append(pq.poll());
        }
        return str.toString();
    }

    public static void main(String[] args) {

    }
}
