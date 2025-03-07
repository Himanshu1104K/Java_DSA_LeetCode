public class CountTotalNumberOfColoredCells {
    public long coloredCells(int n) {
        long ln = (long)n;
        long ans = ln*ln + (ln-1)*(ln-1);
        return ans;
    }
}