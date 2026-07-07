class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return cnt(nums,target);
    }
    private int cnt(int[]a, int tg)
    {
        int sum = 0;
        for(int i:a){
            sum+=i;
        }
        if(sum-tg <0 || (sum-tg)%2!=0) return 0;
        return findWays(a,(sum-tg)/2);
    }
    private int findWays(int a[],int tg)
    {
        int dp[][] = new int[a.length][tg+1];
        if(a[0]==0) dp[0][0] = 2;
        else dp[0][0] = 1;
        if(a[0]!=0 && a[0]<=tg) dp[0][a[0]] = 1;
        for(int i =1;i<a.length;i++)
        {
            for(int j=0;j<=tg;j++)
            {
                int not = dp[i-1][j];
                int take = 0;
                if(a[i]<=j) take = dp[i-1][j-a[i]];
                dp[i][j] = take+not;
            }
        }
        return dp[a.length-1][tg];
    }
}