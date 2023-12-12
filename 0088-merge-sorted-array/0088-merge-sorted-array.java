class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m-1,p=m+n-1,r=n-1;
        while (p>=0) {
            if (r<0) return;
            if (l>=0&&nums1[l]>nums2[r]) {
                nums1[p--]=nums1[l--];
            }
            else nums1[p--]=nums2[r--];
        }
    }
}