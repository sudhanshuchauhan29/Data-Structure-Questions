class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]>list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i =0;i<n;i++)
        {
            if(list.isEmpty() || intervals[i][0]>list.get(list.size()-1)[1]) list.add(intervals[i]);
                else list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1],intervals[i][1]);
        }
        int ans[][] = new int[list.size()][2];
        for(int i =0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
