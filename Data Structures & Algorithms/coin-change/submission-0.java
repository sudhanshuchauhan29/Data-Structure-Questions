class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int prev[] = new int[amount+1];
        for(int i = 0;i<=amount;i++)
        {
            if(i%coins[0]==0)
            {
                prev[i] = i/coins[0];
            }
            else{
                prev[i] = Integer.MAX_VALUE;
            }
        }
        for(int i =1;i<n;i++)
        {

            int curr[] = new int[amount+1];
            for(int j = 0;j<=amount;j++)
           {
                int notPick = prev[j];
                int pick = Integer.MAX_VALUE;
                if(coins[i]<=j && curr[j-coins[i]]!=Integer.MAX_VALUE) pick = 1+curr[j-coins[i]];
                curr[j] = Math.min(pick,notPick);
            }
            prev = curr;
        }
        if(prev[amount]>amount) return -1;
        return prev[amount];
    }
}
