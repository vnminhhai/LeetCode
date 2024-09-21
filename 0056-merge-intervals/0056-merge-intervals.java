class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> res = new ArrayList<>();
        for (int i=0; i<intervals.length; i++){
            int l = intervals[i][0], r = intervals[i][1];
            int skip = 0;
            while (i+skip<intervals.length && intervals[i+skip][0]<=r) {
                r=Math.max(r,intervals[i+skip][1]);
                skip++;
            }
            i+=--skip;
            res.add(new int[]{l,r});
        }
        int[][] resArr = new int[res.size()][2];
        for (int i=0; i<resArr.length; i++) {
            resArr[i][0]=res.get(i)[0];
            resArr[i][1]=res.get(i)[1];
        }
    return resArr;
    }
}