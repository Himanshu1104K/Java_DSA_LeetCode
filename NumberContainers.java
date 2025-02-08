import java.util.*;

class NumberContainers {
    Map<Integer, Integer> map;
    Map<Integer, PriorityQueue<Integer>> smallIndex;

    public NumberContainers() {
        map = new HashMap<>();
        smallIndex = new HashMap<>();
    }

    public void change(int index, int number) {
        if (map.containsKey(index)) {
            int prevNum = map.get(index);
            if (prevNum == number) {
                return;
            }

            smallIndex.get(prevNum).remove(index);
        }
        smallIndex.computeIfAbsent(number, k -> new PriorityQueue<>()).offer(index);
        map.put(index, number);
    }

    public int find(int number) {
        PriorityQueue<Integer> pq = smallIndex.getOrDefault(number, new PriorityQueue<>());
        return pq.isEmpty() ? -1 : pq.peek();
    }
}