class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        int a = 0;
        int b = sb.length()-1;
        while(a<b){
             while (a < b && !Character.isLetterOrDigit(sb.charAt(a))){
                a++;
            }
            while (a < b && !Character.isLetterOrDigit(sb.charAt(b))){
                b--;
            }

            if(sb.charAt(a)!=sb.charAt(b)) return false;
            a++;
            b--;
        }
        return true;
    }
}
