class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length, min[]=new int[len], res=0;
        min[0] = prices[0];     
        for (int i=1; i<len; i++) {
            min[i]=Math.min(prices[i], min[i-1]);
            res=Math.max(res, prices[i]-min[i-1]);
        }
        return res;
    }
}