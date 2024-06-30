//Time: O(n)
//Auxiliary space: O(1)

public class Solution {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int maxProfit = 0;

        for(int i=0 ; i<prices.length ; i++){
            int trade = prices[i] - minimum;
            maxProfit = Math.max(maxProfit, trade);
            minimum = Math.min(minimum, prices[i]);
        }
        return maxProfit;
    }
}