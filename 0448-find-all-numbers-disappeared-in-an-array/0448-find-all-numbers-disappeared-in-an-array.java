class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean is_1 = false;
        int index = -1;
        
        for(int i = 0; i < nums.length; i++){
            index = Math.abs(nums[i] )-1;
            nums[index] = Math.abs(nums[index])* -1;
            
            if(index == 0)
                is_1 = true;
        }
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(!is_1)
            ans.add(1);
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > 0)
                ans.add(i +1);
        }
        
        return ans;
    }
}