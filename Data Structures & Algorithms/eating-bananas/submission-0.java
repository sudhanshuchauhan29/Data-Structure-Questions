class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int max = Integer.MIN_VALUE;
       for(int i:piles)
       {
        max = Math.max(max,i);
       }
       int low = 1;
       int high = max;
       int ans = max;
       while(low<=high)
       {
        int mid = low + (high-low)/2;
        int hour = calc(piles,mid);
        if(hour<=h)
        {
            ans = mid;
            high = mid-1;
        }
        else low = mid+1;
       }
        return ans;
    }
    private int calc(int a[],int speed)
    {
        int time = 0;
        for(int i :a)
        {
            time += Math.ceil((double)i/speed);
        }
        return time;
    }
}
