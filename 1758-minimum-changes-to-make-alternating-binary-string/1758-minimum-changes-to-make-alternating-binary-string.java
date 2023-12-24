class Solution {
    static boolean t=true;
    public int minOperations(String s) {
        int m1=0;
        for (int i=0; i<s.length(); i++) {
            if ((t=!t)==(s.charAt(i)=='1')) ++m1;
        }
        return Math.min(m1,s.length()-m1);
    }
}