class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ref = new HashSet<Integer>();
        
        for(int i = 0; i < nums1.length; i++){
            if(!ref.contains(nums1[i]))
                ref.add(nums1[i]);
        }
        
        int[] ans = new int[ref.size()];
        int index = 0;
        
        for(int i = 0; i < nums2.length; i++){
            if(ref.contains(nums2[i])){
                ans[index++] = (nums2[i]);
                ref.remove(nums2[i]);
            }
        }
        
        return Arrays.copyOfRange(ans, 0, index);
    }
}