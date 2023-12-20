class Solution {
    public int buyChoco(int[] prices, int money) {
        int m1=100, m2=100;
        for (int i: prices) {
            if (i<m1) {
                m2=m1;
                m1=i;
            }
            else if (i<m2) {
                m2=i;
            }
        }
        return money>=m1+m2 ? money-m1-m2 : money;
    }
}