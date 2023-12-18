class Solution {
    public int maxProductDifference(int[] nums) {
        int m1=nums[0],m2=1,m3=nums[0],m4=10000;
        for (int i=1; i<nums.length; i++) {
            if (nums[i]>m1) {
                m2=m1;
                m1=nums[i];
            }
            else if (nums[i]>m2) {
                m2=nums[i];
            }
            if (nums[i]<m3) {
                m4=m3;
                m3=nums[i];
            }
            else if (nums[i]<m4) {
                m4=nums[i];
            }
        }
        return m1*m2-m3*m4;
    }
}