
public class BestTimeBuySellStock {

    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (maxPro < (prices[i] - buy)) {
                maxPro = prices[i] - buy;
            }
        }

        return maxPro;
    }
}
