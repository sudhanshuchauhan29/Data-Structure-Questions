class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long m = Math.abs((long)n);  
        while(m>0){
            if(m%2!=0){
                m = m-1;
                ans = ans*x;
            }
            else{
                m = m/2;
                x = x*x;
            }
        }
        if(n<0) return 1.0/ans;
        return ans;
    }
}
