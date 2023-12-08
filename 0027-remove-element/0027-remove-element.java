class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0, t=nums.length;
        for (int i=0; i<t; i++) {
            nums[i-c]=nums[i];
            if (nums[i]==val) ++c;
        }
        return t-c;
    }
}