import java.util.*;

public class MaxAveragePassRatio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        int n = classes.length;
        double Sumval = 0;
        for (int i = 0; i < n; i++) {
            double val1 = (double) classes[i][0] / classes[i][1];
            double val2 = (double) (classes[i][0] + 1) / (classes[i][1] + 1);
            double val = val2 - val1;

            Sumval += val1;

            pq.add(new double[] { val, i });
        }

        for (int j = 0; j < extraStudents; j++) {
            double[] que = pq.poll();
            double val = que[0];
            int i = (int) que[1];
            Sumval += val;
            classes[i][0]++;
            classes[i][1]++;
            double val1 = (double) classes[i][0] / classes[i][1];
            double val2 = (double) (classes[i][0] + 1) / (classes[i][1] + 1);
            val = val2 - val1;
            pq.add(new double[] { val, i });
        }
        return Sumval / n;
    }
}