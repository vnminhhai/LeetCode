class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for (int i=0; i<nums.length; i++) {
            if (c>0) nums[i-c]=nums[i];
            if (nums[i]==val) ++c;
        }
        return nums.length-c;
    }
}