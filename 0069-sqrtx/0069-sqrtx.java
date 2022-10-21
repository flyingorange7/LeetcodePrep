class Solution {
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        
        int start = 1;
        int end = x/2;
        
        while(start < end){
            int mid = (start + end +1)/2;
            long val = (long) mid*mid;
            
            if(val == x)
                return mid;
            else if(val > x)
                end = mid -1;
            else if(val < x)
                start = mid;
        }
        
        return start;
    }
}