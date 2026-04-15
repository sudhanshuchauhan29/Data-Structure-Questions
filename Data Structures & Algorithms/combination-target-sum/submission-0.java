class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>list = new ArrayList<>();
        List<Integer>ds = new ArrayList<>();
        fun(0,list,ds,nums,target);
        return list;
    }
    private void fun(int ind,List<List<Integer>>list,List<Integer>ds,int nums[],int tg){
            if(ind==nums.length){
                if(tg==0) list.add(new ArrayList<>(ds));
                return;
            }
            if(tg>=nums[ind]) {
                ds.add(nums[ind]);
                fun(ind,list,ds,nums,tg-nums[ind]);
                ds.remove(ds.size()-1);
            }
            
            fun(ind+1,list,ds,nums,tg);
    }
}
