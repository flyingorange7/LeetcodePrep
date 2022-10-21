class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        
        while(start < end){
            int mid = (start + end -1)/2;
            int val = nums[mid];
            
            if(val == target)
                return mid;
            if(val > target)
                end = mid;
            if(val < target)
                start = mid +1;
        }
        
        return nums[start] == target ? start : -1;
    }
}