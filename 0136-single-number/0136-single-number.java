class Solution {
    static int xor;
    public int singleNumber(int[] nums) {
        xor = nums[0];
        for(int i = 1; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor; 
    }
}