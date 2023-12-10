class Solution {
    public int binaryGap(int n) {
        int longest=0, counting=0;
        while (n>0&&n%2!=1) n/=2;
        n/=2;
        while (n>0) {
            counting++;
            if (n%2==1) {longest=Math.max(longest,counting); counting=0;}
            n/=2;
        }
        return longest;
    }
}