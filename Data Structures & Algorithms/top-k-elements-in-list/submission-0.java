class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] buck = new ArrayList[nums.length+1];
        for(int key:map.keySet()){
            int i = map.get(key);
            if(buck[i]==null) buck[i] = new ArrayList<>();
            buck[i].add(key);
        }
        int[] res = new int[k];
        int idx = 0;

        for(int i = buck.length-1; i>=0 && idx<k; i--){
            if(buck[i] != null){
                for(int num : buck[i]){
                    res[idx++] = num;
                    if(idx == k) break;
                }
            }
        }
        return res;
    }
}
