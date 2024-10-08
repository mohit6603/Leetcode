class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxprofit = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }

            profit = prices[i] - min;
            maxprofit = Math.max(profit, maxprofit);
        }
        return maxprofit;
    }
}