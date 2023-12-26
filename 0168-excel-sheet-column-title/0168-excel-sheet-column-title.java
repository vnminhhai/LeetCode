class Solution {
    static StringBuilder res;
    public String convertToTitle(int columnNumber) {
        res=new StringBuilder();
        while (columnNumber>0) {
            res.insert(0,(char)((--columnNumber)%26+'A'));
            columnNumber/=26;
        }
        return res.toString();
    }
}