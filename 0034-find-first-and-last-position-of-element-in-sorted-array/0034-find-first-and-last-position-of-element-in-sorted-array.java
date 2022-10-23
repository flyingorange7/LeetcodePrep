class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        if(nums.length == 0)
            return ans;
        
        int start = 0;
        int end = nums.length -1;
        
        while(start < end){
            int mid = start + (end - start -1)/2;
            
            if(nums[mid] >= target)
                end = mid;
            else 
                start = mid +1;
        }
        if(nums[start] == target)
            ans[0] = ans[1] = start;
        
        start = 0;
        end = nums.length -1;
        
        while(start < end){
            int mid = start + (end - start +1)/2;
            
            if(nums[mid] <= target)
                start = mid;
            else
                end = mid -1;
        }
        
        if(nums[start] == target){
            if(ans[0] == -1)
                ans[0] = start;
            ans[1] = start;
        }
        
        return ans;
    }
}