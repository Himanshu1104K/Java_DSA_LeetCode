
import java.util.*;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            int nCurr = 0;
            while (n != 0) {
                int bit = n % 10;
                nCurr += bit * bit;
                n = n / 10;
            }
            n = nCurr;
        }
        return true;
    }
}
