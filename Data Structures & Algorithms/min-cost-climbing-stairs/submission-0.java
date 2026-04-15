class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(fun(n-1,dp,cost),fun(n-2,dp,cost));
    }
    private int fun(int i ,int dp[],int a[]){
        if(i<0) return 0;
        if(i==0||i==1) return a[i];
        if(dp[i]!=-1) return dp[i];
        return dp[i] = a[i] + Math.min(fun(i-1,dp,a),fun(i-2,dp,a));
    }
}
