class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, r=nums.length-1, m;
        while(l<r) {
            m=(l+r)/2;
            if (target==nums[m]) return m;
            if (target>nums[m]) l=m+1;
            else r=m-1;
        }
        return nums[l]>=target ? l: l+1;
    }
}