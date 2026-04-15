class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer>set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max = nums[nums.length-1];
        if(max<=0) return 1;
        for(int i = 1 ;i<=max;i++){
            if(!set.contains(i)) return i;
        }
        return max+1;
    }
}