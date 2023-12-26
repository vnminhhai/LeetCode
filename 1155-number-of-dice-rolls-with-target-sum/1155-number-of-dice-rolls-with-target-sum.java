class Solution {
    static int[][] dp;
    static int max;
    public int numRollsToTarget(int n, int k, int target) {
        max=k;
        dp=new int[n][target];
        for (int i=1; i<n; i++) {
            for (int j=0; j<target; j++) {
                dp[i][j]=-1;   
            }
        }
        return helper(n,dp,target);
    }
    int helper(int cur, int[][] dp, int target) {
        if (target<cur||target>cur*max) return 0;
        if (cur==1) return 1;
        if (dp[cur-1][target-1]!=-1) return dp[cur-1][target-1];
        int res=0;
        for (int i=1; i<=max; i++) {
            res+=helper(cur-1, dp, target-i);
            res%=1000000007;
        }
        return dp[cur-1][target-1]=res;
    }
}