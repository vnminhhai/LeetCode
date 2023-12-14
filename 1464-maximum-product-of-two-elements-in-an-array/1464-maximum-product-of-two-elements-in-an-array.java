class Solution {
    public int maxProduct(int[] nums) {
        int m1=nums[0],m2=nums[1];
        for (int i=2; i<nums.length; i++) {
            if (nums[i]>m1) {
                if (m2<m1) m2=m1; 
                m1=nums[i];
            }
            else if (nums[i]>m2) m2=nums[i];
        }
        return (m1-1)*(m2-1);
    }
}