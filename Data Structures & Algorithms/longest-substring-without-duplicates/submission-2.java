class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n  = s.length();
      int ans = 0;
      int hash[] = new int[256];
      for(int i = 0;i<256;i++){
        hash[i] = -1;
      }
      int l = 0;
      int h = 0;
      while(h<n){
        char ch = s.charAt(h);
        if(hash[ch]!=-1){
          if(hash[ch]>=l){
            l = hash[ch]+1;
          }
        }
        ans = Math.max(ans,h-l+1);
        hash[ch] = h;
        h++;
      }
      return ans;
    }
}
