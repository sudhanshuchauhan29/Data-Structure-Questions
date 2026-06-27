class Solution {
    public String minWindow(String s, String t) {
        int arr [] = new int[256];
        int l = 0,r = 0,len = Integer.MAX_VALUE;
        int start = -1;
        int c = 0;
        for(int i =0;i<t.length();i++)
        {
            arr[t.charAt(i)]++;
        }
        while(r<s.length())
        {
            if(arr[s.charAt(r)]>0) c++;
            arr[s.charAt(r)]--;
            while(c==t.length())
            {
                if (r-l+1<len) {
                    len = r-l+1;
                    start = l;
                }
                arr[s.charAt(l)]++;
                if(arr[s.charAt(l)]>0) c--;
                l++;
            }
            r++;
        }
        return (start==-1)?"":s.substring(start,start+len);
    }
}
