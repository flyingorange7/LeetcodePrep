class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1)
            return true;
        
        int start = 1;
        int end = num/2;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            long val = (long)mid*mid;
            
            if(val == num)
                return true;
            else if(val > num)
                end = mid -1;
            else
                start = mid +1;
        }
        return false;
    }
}