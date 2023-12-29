class Solution {
    public int search(int[] nums, int target) {
        int l=nums.length, mid=-1, left=0, right=l-1, k=0;
        if (nums[left]>=nums[right])
        while (left<right) {
            if (left>=right-1) {k=l-(nums[left]>nums[right]? left:right)-1; break;}
            else {
                mid=(left+right)/2;
                if (nums[mid]>nums[right]) left=mid;
                else right=mid;
            }
        }
        
        left=0; right=l-1;
        while (left<right) {
            mid=(left+right)/2;
            if (nums[(mid-k+l)%l]==target) return (mid-k+l)%l;
            if (nums[(mid-k+l)%l]>target) right=mid-1;
            else left=mid+1;
        }
        return nums[(left-k+l)%l]==target? (left-k+l)%l:-1;
    }
}