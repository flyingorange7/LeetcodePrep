class Solution {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        int end = temp.length -1;
        StringBuilder ans = new StringBuilder();
        
        while(end >= 0){
            if(temp[end] != ""){
                ans.append(temp[end]);
                ans.append(" ");
            }
            end--;
        }
        ans.deleteCharAt(ans.length() -1);
        
        return ans.toString();
    }
}