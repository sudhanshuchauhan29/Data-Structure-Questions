class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        int k = 1; 
        
        while (len >= 0) {
            digits[len] += k;
            if (digits[len] < 10) {
                return digits; 
            }
            digits[len] = 0; 
            len--;
        }
        
        
        int[] result = new int[digits.length + 1];
        result[0] = 1; 
        return result;
    }
}
