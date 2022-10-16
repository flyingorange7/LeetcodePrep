class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        int temp = -1;
        
        while(start < end){
            if(nums[start]%2 != 0 && nums[end]%2 == 0){
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            else if(nums[start]%2 == 0)
                start++;
            else
                end--;
        }
        
        return nums;
    }
}