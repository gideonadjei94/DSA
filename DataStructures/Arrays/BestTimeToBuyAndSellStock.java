package DataStructures.Arrays;

public class BestTimeToBuyAndSellStock {

    static int findMaxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockData = {7, 1, 5, 3, 6, 4};
        System.out.println(findMaxProfit(stockData));
    }
}
