import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class MaxEmployeeToBeInvitedToTheMeeting {
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        int[] inDeg = new int[n], depth = new int[n];
        Arrays.fill(depth, 1);

        for (int f : favorite) {
            inDeg[f]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDeg[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int cur = q.poll();
            int next = favorite[cur];
            depth[next] = Math.max(depth[next], depth[cur] + 1);
            if (--inDeg[next] == 0) {
                q.offer(next);
            }
        }

        int maxCycle = 0, twoCycleSum = 0;

        for (int i = 0; i < n; i++) {
            if (inDeg[i] == 0) {
                continue;
            }

            int len = 0, cur = i;
            while (inDeg[cur] != 0) {
                inDeg[cur] = 0;
                len++;
                cur = favorite[cur];
            }

            if (len == 2) {
                twoCycleSum += depth[i] + depth[favorite[i]];
            } else {
                maxCycle = Math.max(maxCycle, len);
            }

        }

        return Math.max(maxCycle, twoCycleSum);
    }
}