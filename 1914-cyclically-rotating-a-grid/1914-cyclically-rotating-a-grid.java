class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int top=0, bot=grid.length-1, left=0, right=grid[0].length-1;
        while (top<bot && left<right) {
            int arr[] = new int[2*(right-left+bot-top)], idx=0;
            
            for (int i= left; i<right; i++) {
                arr[idx++]=grid[top][i];
            }
            for (int i= top; i<bot; i++) {
                arr[idx++]=grid[i][right];
            }
            for (int i= right; i>left; i--) {
                arr[idx++]=grid[bot][i];
            }
            for (int i= bot; i>top; i--) {
                arr[idx++]=grid[i][left];
            }
            
            idx = k%arr.length;
            int l=arr.length;
            for (int i= left; i<right; i++) {
                grid[top][i]=arr[(idx++)%l];
            }
            for (int i= top; i<bot; i++) {
                grid[i][right]=arr[(idx++)%l];
            }
            for (int i= right; i>left; i--) {
                grid[bot][i]=arr[(idx++)%l];
            }
            for (int i= bot; i>top; i--) {
                grid[i][left]=arr[(idx++)%l];
            }
            ++top;
            ++left;
            --bot;
            --right;
        }
        return grid;
    }
}