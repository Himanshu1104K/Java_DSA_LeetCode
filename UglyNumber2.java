
public class UglyNumber2 {
    // public static int nthUglyNumber(int n) {
    // if (n == 1) {
    // return 1;
    // }
    // int num = 0;
    // int TwoArr[] = new int[n];
    // int ThreeArr[] = new int[n];
    // int FiveArr[] = new int[n];

    // for (int i = 1; i <= n; i++) {
    // TwoArr[i - 1] = 2 * i;
    // ThreeArr[i - 1] = 3 * i;
    // FiveArr[i - 1] = 5 * i;
    // }
    // int x = 0, y = 0, z = 0;
    // for (int i = 2; i <= n; i++) {
    // num = Integer.min(Integer.min(TwoArr[x], ThreeArr[y]), FiveArr[z]);
    // if (!(num == FiveArr[z]) && TwoArr[x] == ThreeArr[y]) {
    // x++;
    // y++;
    // } else if (!(num == ThreeArr[y]) && TwoArr[x] == FiveArr[z]) {
    // x++;
    // z++;
    // } else if (!(num == TwoArr[x]) && ThreeArr[y] == FiveArr[z]) {
    // y++;
    // z++;
    // } else if (TwoArr[x] == ThreeArr[y] && ThreeArr[y] == FiveArr[z]) {
    // x++;
    // y++;
    // z++;
    // } else if (num == TwoArr[x]) {
    // x++;
    // } else if (num == ThreeArr[y]) {
    // y++;
    // } else if (num == FiveArr[z]) {
    // z++;
    // }
    // // System.out.println(num);
    // }

    // return num;

    // }

    public static int nthUglyNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int UglyArr[] = new int[n];
        UglyArr[0] = 1;
        int x = 0, y = 0, z = 0;
        for (int i = 1; i < n; i++) {
            UglyArr[i] = Integer.min(Integer.min(2 * UglyArr[x], 3 * UglyArr[y]), 5 * UglyArr[z]);

            if (!(UglyArr[i] == 5 * UglyArr[z]) && ((2 * UglyArr[x]) == (3 * UglyArr[y]))) {
                x++;
                y++;
            } else if (!(UglyArr[i] == 3 * UglyArr[y]) && ((2 * UglyArr[x]) == (5 * UglyArr[z]))) {
                x++;
                z++;
            } else if (!(UglyArr[i] == (2 * UglyArr[x])) && ((3 * UglyArr[y]) == (5 * UglyArr[z]))) {
                y++;
                z++;
            } else if ((2 * UglyArr[x]) == (3 * UglyArr[y]) && ((3 * UglyArr[y]) == (5 * UglyArr[z]))) {
                x++;
                y++;
                z++;
            } else if (UglyArr[i] == (2 * UglyArr[x])) {
                x++;
            } else if (UglyArr[i] == (3 * UglyArr[y])) {
                y++;
            } else if (UglyArr[i] == (5 * UglyArr[z])) {
                z++;
            }
            // System.out.println(UglyArr[i]);
        }
        return UglyArr[n-1];
    }

    public static void main(String[] args) {
        int n = nthUglyNumber(10);
        System.out.println(n);
    }
}