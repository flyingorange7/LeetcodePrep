class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> ref = new HashMap<Integer, Integer>();
        
        return cal(n, ref);
    }
    
    public int cal(int n, HashMap<Integer, Integer> ref){
        if(ref.containsKey(n))
            return ref.get(n);
        if(n == 0)
            return 1;
        if(n < 0)
            return 0;
        
        ref.put(n, cal(n-1, ref) + cal(n-2, ref));
        
        return ref.get(n);
    }
}