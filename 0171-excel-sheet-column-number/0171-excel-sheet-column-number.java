class Solution {
    static StringBuilder sb;
    static int res;
    public int titleToNumber(String columnTitle) {
        sb=new StringBuilder(columnTitle);
        res=0;
        int i=1;
        while (sb.length()>0) {
            res+=(1+sb.charAt(sb.length()-1)-'A')*i;
            i*=26;
            sb.deleteCharAt(sb.length()-1);
        }
        return res;
    }
}