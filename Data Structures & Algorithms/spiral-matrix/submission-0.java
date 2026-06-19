class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0, t = 0;
        int r = m-1;
        int b = n-1;
        List<Integer>list = new ArrayList<>();
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++)
            {
                list.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                list.add(matrix[i][r]);
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                list.add(matrix[b][i]);
            }
            b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                {
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}
