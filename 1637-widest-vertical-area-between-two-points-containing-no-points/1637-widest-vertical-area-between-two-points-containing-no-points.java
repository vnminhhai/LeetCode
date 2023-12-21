class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n=points.length, a[]=new int[n];
        for (int i=0; i<n; i++) {
            a[i]=points[i][0];
        }
        Arrays.sort(a);
        int res=0;
        for (int i=1; i<n; i++) {
            if (a[i]-a[i-1]>res) res=a[i]-a[i-1];
        }
        return res;
    }
}