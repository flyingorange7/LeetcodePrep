class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];
        
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0; i < strs[0].length(); i++){
            char ref = strs[0].charAt(i);
            boolean valid = true;
            
            for(int j = 0; j < strs.length; j++){
                if(i >= strs[j].length()){
                    valid = false;
                }
                else if(ref != strs[j].charAt(i)){
                    valid = false;
                }
            }
            if(!valid)
                break;
            
            ans.append(ref);
        }     
        
        return ans.toString();
    }
}