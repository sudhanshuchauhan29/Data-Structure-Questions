class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char str[] = s.toCharArray();
        char tr[] = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(tr);
        
        for(int i =0;i<str.length;i++){
            if(str[i]!=tr[i]) return false;
        }
        return true;
    }
}
