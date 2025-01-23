import java.util.*;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n];
        for (int key : rooms.get(0)) {
            stack.push(key);
        }
        visited[0] = true;
        while (!stack.isEmpty()) {
            int key = stack.pop();
            if (visited[key]) {
                continue;
            }

            for (int room : rooms.get(key)) {
                stack.push(room);
            }

            visited[key] = true;
        }

        for (boolean isVisit : visited) {
            if (!isVisit) {
                return false;
            }
        }

        return true;
    }
}
