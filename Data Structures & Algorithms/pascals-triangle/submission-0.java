class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list = new ArrayList<>();
        for(int i =1;i<=numRows;i++)
        {
            list.add(gen(i));
        }
        return list;
    }
    private List<Integer> gen(int n)
    {
        int ans = 1;
        List<Integer>temp = new ArrayList<>();
        temp.add(ans);
        for(int i =1;i<n;i++)
        {
            ans = ans*(n-i);
            ans = ans/i;
            temp.add(ans);
        }
        return temp;
    }
}