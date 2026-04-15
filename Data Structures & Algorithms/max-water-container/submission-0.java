class Solution {
    public int maxArea(int[] heights) {
    int n = heights.length;
    int max = 0;
    int left = 0;
    int right = n-1;
    
    while(left<right){
        int leftH = heights[left];
        int rightH = heights[right];
        max = Math.max(max,Math.min(leftH,rightH)*(right-left));
        if(leftH>rightH) right--;
        else left++;
        
    }
    return max;
    }
}
