class Solution {
    static int res;
    public int minCost(String colors, int[] neededTime) {
        res=0;
        for (int i=0; i<neededTime.length-1; i++) {
            res+=neededTime[i];
            int max=neededTime[i];
            while (colors.charAt(i)==colors.charAt(i+1)) {
                max=Math.max(max,neededTime[++i]);
                res+=neededTime[i];
                if (i==neededTime.length-1) return res-max;
            }
            res-=max;
        }
        return res;
    }
}