class Solution {
    public int rob(int[] nums) {
        int prev1 = nums[0];
        int prev2 = 0;
        for(int i =1;i<nums.length;i++){
            int pick = prev1;
            
            int notPick = prev2 + nums[i];
            int curr = Math.max(pick,notPick);
            prev2 = prev1;;
            prev1 = curr;
        }
        return prev1;
    }
}
