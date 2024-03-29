class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int temp = -1;
        
        for(int i = arr.length -1; i >= 0; i--){
            temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        
        return arr;
    }
}