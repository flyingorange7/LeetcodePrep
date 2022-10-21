class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] ref = s.split(" ");
        int run = 0;
        
        while(run < ref.length){
            if(ref[run] != ""){
                ans.append(reverseWord(ref[run]));
                ans.append(" ");
            }
            run++;
        }
        ans.deleteCharAt(ans.length() -1);
        
        return ans.toString();
    }
    
    public String reverseWord(String s){
        char[] word = s.toCharArray();
        int start = 0;
        int end = word.length -1;
        
        while(start < end){
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            
            start++;
            end--;
        }
        
        return new String(word);
    }
}