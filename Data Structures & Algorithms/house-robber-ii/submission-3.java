class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0)return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int arr1[] = new int[n-1];
        int arr2[] = new int[n-1];
        for(int i =0;i<n;i++){
            if(i!=0) arr1[i-1] = nums[i];
            if(i!=n-1)arr2[i] = nums[i];
        }
        return Math.max(solve(arr1),solve(arr2));
    }
    private int solve(int nums[]){
        int n = nums.length;
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0],nums[1]);
        for(int i =2;i<n;i++){
            int pick = nums[i]+prev2;
            int notPick = prev1;
            int curr = Math.max(pick,notPick);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
