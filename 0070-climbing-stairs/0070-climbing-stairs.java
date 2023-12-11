class Solution {
    public int climbStairs(int n) {
        if (n<3) return n;
        int p,p2=1,p1=2;
        n-=2;
        while (n-->0) {
            p=p1;
            p1=p1+p2;
            p2=p;
        }
        return p1;
    }
}