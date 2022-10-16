class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.add(Arrays.asList(1));
        
        for(int i = 2; i <= numRows; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            int len = 0;
            
            while(len < i){
                if(len == 0 || len == i-1)
                    temp.add(1);
                else{
                    temp.add(ans.get(i-2).get(len) + ans.get(i-2).get(len -1));
                }
                len++;
            }
            
            ans.add(temp);
        }
        
        return ans;
    }
}