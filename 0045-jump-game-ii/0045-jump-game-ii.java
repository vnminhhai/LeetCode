class Solution {
    static int dp[];
    public int jump(int[] nums) {
        int len=nums.length;
        if (len==1) return 0;
        dp=new int[len-1];
        Arrays.fill(dp, 10000);
        for (int i=len-2; i>=0; i--) {
            if (nums[i]+i>=len-1) {dp[i]=1; continue;}
            else for (int j=i+1; j<=i+nums[i]; j++) {
                dp[i]=Math.min(dp[i],dp[j]+1);
            }
        }
        return dp[0];
    }
}