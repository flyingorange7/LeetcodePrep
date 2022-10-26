class Solution {
    public void reverseString(char[] s) {
        recursive(s, 0, s.length -1);
    }
    
    public void recursive(char[] s, int start, int end){
        if(start >= end)
            return;
        
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        
        recursive(s, start +1, end -1);
    }
}