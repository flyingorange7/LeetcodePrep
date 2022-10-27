class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        int m = 0;
        int n = 0;
        int index = 0;
        
        while(m < nums1.length && n < nums2.length){
            if(nums1[m] <= nums2[n]){
                merge[index++] = nums1[m++];
            }
            else{
                merge[index++] = nums2[n++];
            }
        }
        
        while(m < nums1.length){
            merge[index++] = nums1[m++];
        }
        
        while(n < nums2.length){
            merge[index++] = nums2[n++];
        }
        
        return (double) (merge[index/2] + merge[(index -1)/2])/2;
    }
}