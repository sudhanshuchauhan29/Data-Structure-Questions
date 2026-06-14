class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        int hash[] = new int[256];
        Arrays.fill(hash,-1);
        int l = 0,r=0;
        while(r<n){
            char ch = s.charAt(r);
            if(hash[ch]!=-1){
                if(hash[ch]>=l) l = hash[ch]+1;
            }
            max = Math.max(max,r-l+1);
            hash[ch] = r;
            r++;
        }
        return max;
    }
}
