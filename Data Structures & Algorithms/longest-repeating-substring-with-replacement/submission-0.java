class Solution {
    public int characterReplacement(String s, int k) {
        int a[] = new int[26];
        int r=0,l=0,len=0;
        int n =s.length();
        int maxFreq = 0;
        while(r<n)
        {
            a[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,a[s.charAt(r)-'A']);
            if((r-l+1)-maxFreq > k)
            {
                a[s.charAt(l)-'A']--;
                l++;
            }
            else
            {
                len = Math.max(len,r-l+1);
            }
            r++;
        }
        return len;
    }
}
