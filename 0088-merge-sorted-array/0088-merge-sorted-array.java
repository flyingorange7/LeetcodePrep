class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int run = nums1.length -1;
        m--;
        n--;
        
        while(m >= 0 && n >= 0){
            if(nums1[m] > nums2[n]){
                nums1[run] = nums1[m];
                m--;
            }
            else{
                nums1[run] = nums2[n];
                n--;
            }
            run--;
        }
        
        while(m >= 0){
            nums1[run] = nums1[m];
            m--;
            run--;
        }
        
        while(n >= 0){
            nums1[run] = nums2[n];
            n--;
            run--;
        }
    }
}