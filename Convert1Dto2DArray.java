import java.util.*;

public class Convert1Dto2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != (m * n)) {
            return new int[][] {};
        }
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            result[i] = Arrays.copyOfRange(original, i * n, i * n + n);
        }

        return result;
    }
}