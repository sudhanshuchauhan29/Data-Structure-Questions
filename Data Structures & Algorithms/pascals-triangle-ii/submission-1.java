class Solution {
    public List<Integer> getRow(int rowIndex) {
        int ans = 1;
        List<Integer>temp = new ArrayList<>();
        temp.add(ans);
        int n = rowIndex+1;
        for(int i =1;i<n;i++)
        {
            ans = (int)((long) ans * (rowIndex + 1 - i) / i); 
            temp.add(ans);
        }
        return temp;
    }
}