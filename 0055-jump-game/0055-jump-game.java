class Solution {
    static boolean[] dp;
    static int len;
    public boolean canJump(int[] nums) {
        len=nums.length;
        if (len==1) return true;
        int min=len-1;
        dp= new boolean[len];
        Arrays.fill(dp,false);
        for (int i=len-2; i>=0; i--) {
            if (nums[i]+i>=min) {dp[i]=true; min=i;}
        }
        return dp[0];
    }
}