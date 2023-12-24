class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                char cur = board[i][j];
                if (cur=='.') continue;
                for (int t=1; t<9; t++) {
                    if (cur==board[(i+t)%9][j]) return false;
                    if (cur==board[i][(j+t)%9]) return false;
                }
                if (cur==board[(i+1)%3+i/3*3][(j+1)%3+j/3*3]||cur==board[(i+2)%3+i/3*3][(j+2)%3+j/3*3]||cur==board[(i+2)%3+i/3*3][(j+1)%3+j/3*3]||cur==board[(i+1)%3+i/3*3][(j+2)%3+j/3*3]) return false;
            }
        }
        return true;
    }
}