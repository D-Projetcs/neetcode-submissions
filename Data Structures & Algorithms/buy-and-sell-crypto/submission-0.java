class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = 10000;
        int maxProfit = -1;

        for(int i=0;i < prices.length; i++){
            if(prices[i] < minBuy){
                minBuy = prices[i];
            }
            int todayProfit = prices[i] - minBuy;
            if(maxProfit < todayProfit){
                maxProfit = todayProfit;
            }
        }
        return maxProfit;
    }
}
