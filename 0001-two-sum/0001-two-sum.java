class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ref = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(ref.containsKey(target -nums[i]))
                return new int[]{ref.get(target -nums[i]), i};
            
            ref.put(nums[i], i);
        }
        
        return new int[]{-1, -1};
    }
}