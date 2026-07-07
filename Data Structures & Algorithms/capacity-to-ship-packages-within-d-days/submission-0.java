class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = weights[0];
        int  max = weights[0];
        int ans = 0;
        for(int num : weights){
            sum+=num;
            max = Math.max(max,num);
        }
        int low = max;
        int high = sum;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(shipped(weights,days,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    private boolean shipped(int arr[],int days, int cap){
        int usedDay = 1;
        int cnt= 0;
        for(int w : arr){
            if(cnt+w > cap){
                usedDay++;
                cnt = 0;
            }
            cnt+=w;
        }
        
        return (usedDay<=days);
    }
}