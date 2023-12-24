class Solution {
    public int minOperations(String s) {
        boolean t=true;
        int m1=0,m2=0;
        for (int i=0; i<s.length(); i++) {
            if ((t=!t)==(s.charAt(i)=='1')) ++m1;
            if (t==(s.charAt(i)=='0')) ++m2;
        }
        return Math.min(m1,m2);
    }
}