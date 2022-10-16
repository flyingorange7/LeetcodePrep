class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int m = a.length() -1;
        int n = b.length() -1;
        int carry = 0;
        
        while(m >= 0 && n >= 0)
            carry = addDigits(carry, a.charAt(m--) - '0', b.charAt(n--) -'0', ans);
        while(m >= 0)
            carry = addDigits(carry, a.charAt(m--) - '0', 0, ans);
        while(n >= 0)
            carry = addDigits(carry, 0, b.charAt(n--) - '0', ans);
        
        if(carry > 0)
            ans.append('1');
        
        return ans.reverse().toString();
    }
    
    public int addDigits(int carry, int val1, int val2, StringBuilder ans){
        int sum = carry + val1 + val2;
        
        if(sum < 2){
            ans.append(sum);
            return 0;
        }
        else{
            ans.append(sum -2);
            return 1;
        }
    }
}