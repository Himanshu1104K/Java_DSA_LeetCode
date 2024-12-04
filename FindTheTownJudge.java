public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int[][] val = new int[n][2];
        for (int[] trusti : trust) {
            val[trusti[1] - 1][0]++;
            val[trusti[0] - 1][1]++;
        }

        for (int i = 0; i < val.length; i++) {
            if (val[i][0] == n - 1 && val[i][1] == 0) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}