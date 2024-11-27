public class CellWithOddValueinMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        int result[][] = new int[m][n];
        for (int[] ind : indices) {
            for (int i = 0; i < n; i++) {
                result[ind[0]][i]++;
            }
            for (int i = 0; i < m; i++) {
                result[i][ind[1]]++;
            }
        }

        int oddInd = 0;

        for (int[] val : result) {
            for (int num : val) {
                if (num % 2 != 0) {
                    oddInd++;
                }
            }
        }
        return oddInd;
    }
}