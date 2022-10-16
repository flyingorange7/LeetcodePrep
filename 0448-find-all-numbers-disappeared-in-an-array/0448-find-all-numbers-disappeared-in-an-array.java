class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int index = -1;
        
        for(int i = 0; i < nums.length; i++){
            index = Math.abs(nums[i])-1;
            nums[index] = Math.abs(nums[index])* -1;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                ans.add(i +1);
        }
        
        return ans;
    }
}