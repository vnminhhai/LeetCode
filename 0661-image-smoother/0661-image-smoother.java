class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m= img.length, n=img[0].length;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                int c=0, s=0;
                for (int t=i-1; t<=i+1; t++) {
                    if (t<0||t>=m) continue;
                    for (int u=j-1; u<=j+1; u++) {
                        if (u<0||u>=n) continue;
                        ++c;
                        s+=img[t][u]%256;
                    }
                }
                img[i][j]+=(s/c)*256;
            }
        }
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                img[i][j]/=256;
            }
        }
        return img;
    }
}