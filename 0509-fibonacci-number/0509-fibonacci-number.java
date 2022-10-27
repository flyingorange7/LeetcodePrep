class Solution {
    public int fib(int n) {
        HashMap<Integer, Integer> ref = new HashMap<Integer, Integer>();
        ref.put(0, 0);
        ref.put(1, 1);
        
        return cal(n, ref);
    }
    
    public int cal(int n, HashMap<Integer, Integer> ref){
        if(n < 2)
            return ref.get(n);
        
        int val = cal(n-1, ref) + cal(n-2, ref);
        ref.put(n, val);
        
        return val;
    }
}