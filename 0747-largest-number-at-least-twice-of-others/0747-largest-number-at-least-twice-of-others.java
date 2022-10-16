class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int maxIndex = -1;
        int half = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                half = max;
                max = nums[i];
                maxIndex = i;
            }
            else if(nums[i] > half && nums[i] < max)
                half = nums[i];
        }
        
        if(max >= half*2)
            return maxIndex;
        
        return -1;
    }
}