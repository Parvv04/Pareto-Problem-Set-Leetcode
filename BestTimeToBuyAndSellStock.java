class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int profit = 0;
        int max = 0;
        for(int right = 0; right < prices.length; right++){
            if(prices[right] < prices[left]){
                left = right;
            }
            profit = prices[right] - prices[left];
            if(profit > max){
                max = profit;
            }

        }
        return max;
    }
}