class Solution {
    public int uniquePaths(int m, int n) {
        Double mf=1.0;
        if (m>n)
        for (int i=1; i<=m-1; i++) {
            mf*=i+n-1;
            mf/=i;
        }
        else {
            for (int i=1; i<=n-1; i++) {
                mf*=i+m-1;
                mf/=i;
            }
        }
        return mf.intValue();
    }
}