class Solution {
    public void rotate(int[][] matrix) {
        int x= matrix.length;
        int[][] mat = new int[x][x];
        for (int i=0; i<x; i++) {
            for (int j =0; j<x; j++) {
                int ny = x-i-1;
                int nx = j;
                mat[nx][ny]= matrix[i][j];
            }
        }
        for (int i=0; i<x; i++) {
            for (int j =0; j<x; j++) {
                int ny = i;
                int nx = x-j-1;
                matrix[i][j]=mat[i][j];
            }
        }
    }
}