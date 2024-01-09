class Solution {
    static int max, dp[][];
    public int lenLongestFibSubseq(int[] A) {
        int len= A.length;
        max=0;
        dp = new int[len][len];
        for (int i=2; i<len; i++) {
            int l=0, r=i-1;
            while (l<r) {
                int sum=A[l]+A[r];
                if (A[i]>sum) l++;
                else if (A[i]<sum) r--;
                else {
                    dp[r][i]=dp[l][r]+1;
                    max = Math.max(max, dp[r][i]);
                    r--;
                    l++;
                }
            }
        }
        return max == 0 ? 0 : max + 2;
    }
}