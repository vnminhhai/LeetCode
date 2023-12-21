class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n=points.length;
        Arrays.sort(points, (x,y) -> Integer.compare(x[0], y[0]));
        int res=0;
        for (int i=1; i<n; i++) {
            if (points[i][0]-points[i-1][0]>res) res=points[i][0]-points[i-1][0];
        }
        return res;
    }
}