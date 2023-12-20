class Solution {
    public int buyChoco(int[] prices, int money) {
        int m1=prices[0], m2=100;
        for (short i=1; i<prices.length; i++) {
            if (prices[i]<m1) {
                m2=m1;
                m1=prices[i];
            }
            else if (prices[i]<m2) {
                m2=prices[i];
            }
        }
        return money>=m1+m2 ? money-m1-m2 : money;
    }
}