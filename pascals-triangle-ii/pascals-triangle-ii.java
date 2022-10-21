class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(1);
        
        for(int i = 1; i <= rowIndex; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i)
                    temp.add(1);
                else{
                    temp.add(ans.get(j) + ans.get(j-1));
                }
            }
            ans = temp;
        }
        return ans;
    }
}