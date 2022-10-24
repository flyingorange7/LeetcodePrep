class Solution {
    public int findDuplicate(int[] nums) {
        int start = 1;
        int end = nums.length -1;
        
        while(start < end){
            int mid = start + (end - start -1)/2;
            int count = getCount(nums, mid);
            
            if(count <= mid)
                start = mid +1;
            else
                end = mid;
        }
        
        return start;
    }
    
    public int getCount(int[] nums, int mid){
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= mid)
                count++;
        }
        
        return count;
    }
}