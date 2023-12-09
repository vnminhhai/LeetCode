class Solution {
    public int[][] generateMatrix(int n) {
        short ix=0,iy=0, c=1;
        int x=n,y=n-1,nums[][]=new int[n][n];
        boolean tangy=true, tangx=true, luotx=true;
        while (c<=n*n) {
            if (luotx) {
                int temp=x--;
                while (temp-->0) {
                    if (tangx) {
                        nums[iy][ix++]=c++;
                    }
                    else {
                        nums[iy][ix--]=c++;
                    }
                }
                if (tangx) {ix--; ++iy;} 
                else {ix++; --iy;}
                tangx=!tangx;
            }
            else {
                int temp=y--;
                while (temp-->0) {
                    if (tangy) {
                        nums[iy++][ix]=c++;
                    }
                    else {
                        nums[iy--][ix]=c++;
                    }
                }
                if (tangy) {ix--; --iy;} 
                else {ix++; ++iy;}
                tangy=!tangy;
            }
            luotx=!luotx;
        }
        return nums;
    }
}