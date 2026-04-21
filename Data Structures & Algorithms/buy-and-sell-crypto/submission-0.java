class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit=0;
        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                if(prices[j]-prices[i]>maxprofit){
                    maxprofit=prices[j]-prices[i];
                }
            }
        }

        return maxprofit;
        
    }
}
