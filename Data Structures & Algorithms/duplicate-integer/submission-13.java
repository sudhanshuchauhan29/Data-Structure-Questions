class Solution {
    public boolean hasDuplicate(int[] nums) {
         Arrays.sort(nums);
       int n = nums.length;
      if(n==0) return false;
      if(n==1) return false;
       if(nums[0]==nums[1]|| nums[n-1]==nums[n-2])return true;
       for(int i = 2;i<n-2;i++){
            if(nums[i]==nums[i-1]||nums[i]==nums[i+1]) return true;
       }
       return false;
       
    }
}