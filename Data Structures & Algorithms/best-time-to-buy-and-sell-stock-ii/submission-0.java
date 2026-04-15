class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(min>prices[i])min = prices[i];
            else{
                max +=prices[i]-min;
                min = prices[i];
            }
        }
        return max;
    }
}