class Solution {
    public int pivotInteger(int n) {
        int left=1, right=n, mid;
        while (left<right) {
            mid=(left+right)/2;
            if (mid*(mid+1)/2==(n+mid)*(n-mid+1)/2) {left=mid; break;}
            if (mid*(mid+1)/2>(n+mid)*(n-mid+1)/2) right=mid-1;
            else left=mid+1;
        }
        if (left*(left+1)/2==(n+left)*(n-left+1)/2) return left;
        else return -1;
    }
}