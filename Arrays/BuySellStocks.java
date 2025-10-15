public class BuySellStocks {

    public static int Stocks(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = price.length;

        for (int i = 0; i < n; i++) {
            if (buyPrice < price[i]) { // Profit Case
                int profit = price[i] - buyPrice; // Today's Profit
                maxProfit = Math.max(maxProfit, profit); // Max Profit
            } else { // Loss Condition, Reset the Buy Price to current Price to avoid loss
                buyPrice = price[i];
            }
        }

        return maxProfit;
    }

    public static void main(String args[]) {
        int price[] = { 7, 1, 5, 3, 6 };

        int profit = Stocks(price);

        System.out.println("The max Profit that is possible is " + profit);

    }
}
