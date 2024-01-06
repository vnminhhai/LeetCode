class Solution {
    static boolean res;
    static int len;
    public boolean canJump(int[] nums) {
        len=nums.length;
        if (len==1) return true;
        int min=len-1;
        for (int i=len-2; i>=0; i--) {
            if (nums[i]+i>=min) min=i;
        }
        return min==0;
    }
}