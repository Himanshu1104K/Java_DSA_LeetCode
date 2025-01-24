import java.util.*;

public class FindEventualSafeStates {
    private int n;
    private int[] degreein;
    private List<List<Integer>> rGraph;
    private List<Integer> ans;

    private void init(int[][] G) {
        n = G.length;
        degreein = new int[n];
        rGraph = new ArrayList<>();
        ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rGraph.add(new ArrayList<>());
        }

        for (int u = 0; u < n; u++) {
            for (int v : G[u]) {
                rGraph.get(v).add(u);
                degreein[u]++;
            }
        }
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        init(graph);
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (degreein[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int u = queue.poll();
            ans.add(u);
            for (int v : rGraph.get(u)) {
                degreein[v]--;
                if (degreein[v] == 0) {
                    queue.add(v);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}