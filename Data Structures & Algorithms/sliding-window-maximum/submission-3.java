class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = k-1;
        int ind = 0;
        int arr[] = new int[n-k+1];
        // if(k==1) return nums;
        while(r<n)
        {
            int max = nums[l];
            for(int i =l;i<=r;i++)
            {
                max =Math.max(max,nums[i]);
            }
            arr[ind++] = max;
            r++;
            l++;
        }
        return arr;
    }
}
