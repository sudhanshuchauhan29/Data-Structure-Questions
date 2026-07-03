class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        else{

            return fun(nums,sum/2);
        }
       
    }
     private boolean fun(int nums[],int tg)
        {
            boolean prev[] = new boolean[tg+1];
            prev[0] = true;
            if(tg>=nums[0]) prev[nums[0]] = true;
            for(int i =1;i<nums.length;i++)
            {
                boolean temp [] = new boolean[tg+1];
                for(int j = 1;j<=tg;j++)
                {
                    boolean notPick = prev[j];
                    boolean pick = false;
                    if(j>=nums[i]) pick = prev[j-nums[i]];
                    temp[j] = pick|notPick;
                }
                prev = temp;
            }
            return prev[tg];
        }
}
