import java.util.*;

public class MinSumOfFourDigitNumAfterSplittingIt {
    public int minimumSum(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num = num / 10;
        }
        Collections.sort(list);
        int ans = list.get(0) * 10 + list.get(1) * 10 + list.get(2) + list.get(3);
        return ans;
    }
}