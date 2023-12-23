class Solution {
    public boolean isPathCrossing(String path) {
        int[][] v = new int[path.length()][2];
        int x=0,y=0,i=0;
        for (char n:path.toCharArray()) {
            switch (n) {
                case 'N':
                    v[i][0]=++x;
                    v[i++][1]=y;
                    break;
                case 'S':
                    v[i][0]=--x;
                    v[i++][1]=y;
                    break;
                case 'E':
                    v[i][0]=x;
                    v[i++][1]=++y;
                    break;
                case 'W':
                    v[i][0]=x;
                    v[i++][1]=--y;
                    break;
            }
            if (x==0&&y==0) return true;
            for (int j=0; j<i-1; j++) {
                if (x==v[j][0]&&y==v[j][1]) return true;
            }
        }
        return false;
    }
}