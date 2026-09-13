class Solution {
    public int maxProfit(int[] prices) {
        int m=prices.length;
       int minprice=prices[0];
       int maxProfit = 0;
       for(int i=0;i<m;i++){
        if(minprice>prices[i]){
            minprice = prices[i];
        }
        int profit = prices[i] - minprice;
        if(profit>maxProfit){
            maxProfit = profit;
        }
       }
       return maxProfit;
      
    }
}