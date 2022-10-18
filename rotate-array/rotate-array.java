class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int count = 0;
        
        for(int i = 0; count < nums.length; i++){
            int current = i;
            int hold = nums[i];
            
            do{
                int next = (current + k)%nums.length;
                
                int temp = nums[next];
                nums[next] = hold;
                hold = temp;
                
                current = next;
                count++;
            }while(current != i);
        }
    }
}