import java.util.*;

public class TwoBestNonOverLappingEvent {
    public int maxTwoEvents(int[][] events) {
        // int maxValue = 0;
        // Arrays.sort(events, (a, b) -> a[0] - b[0]);
        // for (int i = 0; i < events.length; i++) {
        // for (int j = i; j < events.length; j++) {
        // if (events[i][1] < events[j][0]) {
        // int curValue = events[i][2] + events[j][2];
        // maxValue = Math.max(curValue, maxValue);
        // } else {
        // maxValue = Math.max(maxValue, events[j][2]);
        // }
        // }
        // }
        // return maxValue;

        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        int maxvalue = 0, ans = 0;
        for (int[] event : events) {
            int start = event[0], end = event[1], value = event[2];

            while (!pq.isEmpty() && pq.peek()[0] < start) {
                maxvalue = Math.max(maxvalue, pq.poll()[1]);
            }

            ans = Math.max(ans, maxvalue + value);
            pq.add(new int[] { end, value });
        }

        return ans;
    }
}