class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0){
             int mid=nums2.length/2;
             if(nums2.length%2==0){
               
                double ans=(nums2[mid-1]+nums2[mid])/2.0;
                return ans;
             }
             else{
                return nums2[mid];
             }
        }
        else if(nums2.length==0){
             int mid=nums1.length/2;
             if(nums1.length%2==0){
               
                double ans=(nums1[mid-1]+nums1[mid])/2.0;
                return ans;
             }
             else{
                return nums1[mid];
             }
        }
        int len=nums1.length+nums2.length;
        
        double ans=0;
        if(len%2==0){
            ans=(nums1[nums1.length-1]+nums2[0])/2.0;
        }
        else{
            ans=Math.min(nums1[nums1.length-1],nums2[0]);
        }
        return ans;
    }
}   