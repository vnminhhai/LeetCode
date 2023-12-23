class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length, max[]=new int[len], res=0;
        max[len-1] = prices[len-1];
        for (int i=len-2; i>0; i--) {
            max[i]=Math.max(prices[i], max[i+1]);
        }        
        for (int i=0; i<len-1; i++) {
            res=Math.max(res, max[i+1]-prices[i]);
        }
        return res;
    }
}