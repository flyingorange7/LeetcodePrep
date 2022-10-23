class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        LinkedList<Integer> ans = new LinkedList<Integer>();
        
        int index = findClosest(arr, x);
        addValues(arr, k, index, ans, x);
        
        return new ArrayList<Integer>(ans);
    }
    
    public void addValues(int[] arr, int k, int index, LinkedList<Integer> ans, int x){
        int left = index;
        int right = index +1;
        
        while(k > 0){
            int val1 = left < 0 ? Integer.MAX_VALUE : x - arr[left];
            int val2 = right == arr.length ? Integer.MAX_VALUE : arr[right] -x;
            
            if(val1 <= val2)
                ans.addFirst(arr[left--]);
            else
                ans.addLast(arr[right++]);
            k--;
        }
    }
    
    public int findClosest(int[] arr, int x){
        int start = 0;
        int end = arr.length -1;
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            int currDiff = x - arr[mid];
            int mainDiff = res == -1 ? Integer.MAX_VALUE : x - arr[res];
            
            if(currDiff == 0)
                return mid;
            else if(currDiff < 0)
                end = mid -1;
            else
                start = mid +1;
            
            if(Math.abs(mainDiff) > Math.abs(currDiff))
                res = mid;
            else if(Math.abs(mainDiff) == Math.abs(currDiff)){
                res = arr[res] <= arr[mid] ? res : mid;
            }
        }
        return res;
    }
}