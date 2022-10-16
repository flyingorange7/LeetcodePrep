class Solution {
    public int pivotIndex(int[] nums) {
        int[] rightSum = new int[nums.length];
        int left = 0;
        
        for(int i = nums.length -2; i >= 0; i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }
        
        for(int i = 0; i < nums.length; i++){
            if(left == rightSum[i])
                return i;
            
            left += nums[i];
        }
        
        return -1;
    }
}