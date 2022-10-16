class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length -1]++;
        
        for(int i = digits.length -1; i >= 0; i--){
            digits[i] += carry;
            if(digits[i] > 9){
                digits[i] = 0;
                carry = 1;
            }
            else{
                carry = 0;
                break;
            }
        }
        
        if(carry > 0){
            int[] ans = new int[digits.length+1];
            ans[0]++;
            return ans;
        }
        return digits;
    }
}