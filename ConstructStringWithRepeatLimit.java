import java.util.*;

public class ConstructStringWithRepeatLimit {
    public String repeatLimitedString(String s, int repeatLimit) {
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> b - a);
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        pq.addAll(map.keySet());

        StringBuilder str = new StringBuilder();

        while (!pq.isEmpty()) {
            char ch = pq.poll();

            int repeatCount = Math.min(repeatLimit, map.get(ch));
            for (int i = 0; i < repeatCount; i++) {
                str.append(ch);
            }
            map.put(ch, map.get(ch) - repeatCount);

            if (map.get(ch) > 0) {
                if (pq.isEmpty())
                    break;

                char nextCh = pq.poll();
                str.append(nextCh);
                map.put(nextCh, map.get(nextCh) - 1);

                if (map.get(nextCh) > 0) {
                    pq.offer(nextCh);
                }
                pq.offer(ch);
            }

        }

        return str.toString();
    }
}
