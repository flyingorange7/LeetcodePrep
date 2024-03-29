/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    public int search(ArrayReader reader, int target) {
        int start = 0;
        int end = 1;
        
        while(reader.get(end) < target){
            start = end;
            end *= 2;
        }
        
        while(start < end){
            int mid = start + (end - start -1);
            int val = reader.get(mid);
            
            if(val == target)
                return mid;
            else if(val == Integer.MAX_VALUE || val > target)
                end = mid;
            else
                start = mid +1;
        }
        
        return reader.get(start) == target ? start : -1;
    }
}