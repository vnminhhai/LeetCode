class Solution {
    public int[][] transpose(int[][] matrix) {
        int x=matrix[0].length, y=matrix.length, r[][] = new int[x][y];
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                r[i][j]=matrix[j][i];
            }
        }
        return r;
    }
}