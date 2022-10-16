class Solution {
    public int thirdMax(int[] nums) {
        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > a){
                c = b;
                b = a;
                a = nums[i];
            }
            else if(nums[i] < a && nums[i] > b){
                c = b;
                b = nums[i];
            }
            else if(nums[i] > c && nums[i] < b){
                c = nums[i];
            }
        }
        if(b == Long.MIN_VALUE || c == Long.MIN_VALUE)
            return (int)a;
        
        return (int)c;
    }
}