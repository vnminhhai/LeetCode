class Solution {
    public int mySqrt(int x) {
        int left=0, right=46340;
        while (left<right) {
            int mid=(left+right)/2;
            if (mid*mid>x) right=mid-1;
            else left=mid+1;
        }
        if (left*left<=x)
        return left;
        else return left-1;
    }
}