
public class NumberAfterDoubleRev {

    public boolean isSameAfterReversals(int num) {
        int res = 0;
        int newNum = num;
        while (newNum != 0) {
            int bit = newNum % 10;
            res = res * 10 + bit;
            newNum = newNum / 10;
        }
        newNum = res;
        res = 0;
        while (newNum != 0) {
            int bit = newNum % 10;
            res = res * 10 + bit;
            newNum = newNum / 10;
        }
        return res == num;
    }

    public static void main(String[] args) {

    }
}
