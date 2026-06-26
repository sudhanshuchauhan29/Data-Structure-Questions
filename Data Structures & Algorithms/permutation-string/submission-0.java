class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;

        char[] set = s1.toCharArray();
        Arrays.sort(set);
        s1 = new String(set);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            char[] sub = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(sub);

            if (new String(sub).equals(s1)) {
                return true;
            }
        }

        return false;
    }
}
