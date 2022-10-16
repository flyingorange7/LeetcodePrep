class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> ref = new HashSet<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(ref.contains(arr[i]*2) || (arr[i]%2 == 0 && ref.contains(arr[i]/2)))
                return true;
            ref.add(arr[i]);
        }
        
        return false;
    }
}