public class FindSmallestReplaceChalk {
    public static int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        int resIdx = 0;
        int PrevK = k;
        while (k >= chalk[resIdx]) {
            k -= chalk[resIdx];
            if (resIdx == n) {
                k = PrevK%(PrevK-k);
            }
            resIdx = (resIdx + 1) % n;
        }

        return resIdx;
    }

    public static void main(String[] args) {
    }
}