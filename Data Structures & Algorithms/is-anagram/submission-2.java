class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
       char arr[] = s.toCharArray();
       char ans[] = t.toCharArray();
       Arrays.sort(arr);
       Arrays.sort(ans);
       for(int i = 0;i<arr.length;i++){
        if(arr[i]!=ans[i]) return false;
       }
       return true;
    }
}
