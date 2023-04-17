class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(curr >= max)
                    max = curr;
                
                curr = 0;
            }
            else
                curr++;
        }
        
        return curr >= max ? curr : max;
    }
}