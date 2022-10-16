class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3)
            return false;
        
        int run = 0;
        
        while(run < arr.length-1 && arr[run] < arr[run +1]){
            run++;
        }
        
        if(run == 0 || run == arr.length -1)
            return false;
        
        while(run < arr.length -1 && arr[run] > arr[run +1]){
            run++;
        }
        
        if(run != arr.length -1)
            return false;
        
        return true;
    }
}