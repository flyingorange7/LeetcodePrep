class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int before0 = 0;
        int after0 = 0;
        int num0 = 0;
        int max = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(num0 == 0){
                    before0++;
                }
                else{
                    after0++;
                }
            }
            else{
                if(num0 != 0){
                    if(num0 + before0 + after0 > max)
                        max = num0 + before0 + after0;

                    before0 = after0;
                    after0 = 0;
                }
                else
                    num0 = 1;
            }
        }
        
        if(num0 + before0 + after0 > max)
            max = num0 + before0 + after0;
        
        return max;
    }
}