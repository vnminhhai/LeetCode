class Solution {
    static String res;
    public String convertToTitle(int columnNumber) {
        res="";
        while (columnNumber>0) {
            columnNumber--;
            res=(char)((columnNumber)%26+'A')+res;
            columnNumber/=26;
        }
        return res;
    }
}