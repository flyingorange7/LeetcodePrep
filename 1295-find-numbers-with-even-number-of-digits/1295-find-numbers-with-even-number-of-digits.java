class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(calculateDigits(nums[i]))
                ans++;
        }
        
        return ans;
    }
    
    public boolean calculateDigits(int val){
        int count = 0;
        
        while(val > 0){
            val /= 10;
            count++;
        }
        
        return count%2 == 0;
    }
}