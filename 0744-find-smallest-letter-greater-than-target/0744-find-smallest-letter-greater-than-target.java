class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length;
        
        while(start < end){
            int mid = start + (end - start)/2;
            int currDiff = letters[mid] - target;
            
            if(currDiff <= 0)
                start = mid +1;
            else
                end = mid;
        }
        start = start % letters.length;
        
        return letters[start];
    }
}