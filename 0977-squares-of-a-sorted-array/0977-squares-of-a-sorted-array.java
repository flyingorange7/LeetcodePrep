class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        
        int run = nums.length -1;
        int[] ans = new int[nums.length];
        
        while(start <= end){
            int val1 = nums[start] * nums[start];
            int val2 = nums[end] * nums[end];
            
            if(val1 >= val2){
                ans[run] = val1;
                start++;
            }
            else{
                ans[run] = val2;
                end--;
            }
            
            run--;
        }
        
        return ans;
    }
}