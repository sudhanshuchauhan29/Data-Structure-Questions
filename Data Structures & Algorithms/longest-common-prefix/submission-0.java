class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String l = strs[0];
        String h = strs[strs.length-1];
        int i = 0;
        while(i<l.length() && i<h.length() && l.charAt(i)==h.charAt(i)) i++;
        return l.substring(0,i);
    }
}