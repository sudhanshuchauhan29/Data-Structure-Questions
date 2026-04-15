class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return  nums[0];
        ArrayList<Integer>arr1 = new ArrayList<>();
        ArrayList<Integer>arr2 = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(i!=nums.length-1) arr1.add(nums[i]); 
            if(i!=0) arr2.add(nums[i]); 
        }
        return Math.max(rob2(arr1),rob2(arr2));
    }
     public int rob2(ArrayList<Integer>nums) {
        
        int prev1 = nums.get(0);
        int prev2 = 0;
        for(int i =1;i<nums.size();i++){
            int pick = prev1;
            int notPick = prev2 + nums.get(i);
            int curr = Math.max(pick,notPick);
            prev2 = prev1;;
            prev1 = curr;
        }
        return prev1;
    }
}
