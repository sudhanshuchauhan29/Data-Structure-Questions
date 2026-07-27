class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];
        for(int []a:dp)
        {
            Arrays.fill(a,-1);
        }
        return fun(n,m,text1,text2,dp);

    }
    private int fun(int i,int j,String s,String t,int dp[][])
    {
        if(i==0 ||j==0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i-1) == t.charAt(j-1)) return dp[i][j] = 1 + fun(i-1,j-1,s,t,dp);
        return dp[i][j] = Math.max(fun(i-1,j,s,t,dp), fun(i,j-1,s,t,dp));
    }
}
