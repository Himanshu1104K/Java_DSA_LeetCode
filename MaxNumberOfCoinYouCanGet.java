import java.util.*;

public class MaxNumberOfCoinYouCanGet {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int result = 0;
        int index = piles.length - 2;
        int n = piles.length / 3;
        while (n > 0) {
            result += piles[index];
            index -= 2;
            n--;
        }
        return result;
    }
}