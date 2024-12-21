public class FinalPriceWithSpecialDiscount {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            int j = i + 1;
            while (j < prices.length && prices[i] < prices[j]) {
                j++;
            }
            if (j < prices.length && prices[j] <= prices[i]) {
                prices[i] -= prices[j];
            }
        }
        return prices;
    }
}