class Solution {
    public int heightChecker(int[] heights) {
        int[] ref = heights.clone();
        Arrays.sort(ref);
        int ans = 0;
        
        for(int i = 0; i < ref.length; i++){
            if(ref[i] != heights[i])
                ans++;
        }
        
        return ans;
    }
}