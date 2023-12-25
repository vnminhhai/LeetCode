class Solution {
    static int res[], len;
    public int numDecodings(String s) {
        if (s.charAt(0)=='0') return 0;
        len=s.length();
        res = new int[len+1];
        res[0]=1;
        res[1]=1;
        for (int i=2; i<=len; i++) {
            switch (s.charAt(i-1)) {
                case '0': 
                    if (s.charAt(i-2)=='0'||s.charAt(i-2)>'2') 
                        return 0;
                    res[i]=res[i-2];
                    break;
                case '7':
                case '8':
                case '9':
                    if (s.charAt(i-2)=='0'||s.charAt(i-2)>'1') 
                        res[i]=res[i-1];
                    else 
                        res[i]=res[i-1]+res[i-2];
                    break;
                default:
                    if (s.charAt(i-2)=='0'||s.charAt(i-2)>'2') 
                        res[i]=res[i-1];
                    else 
                        res[i]=res[i-1]+res[i-2];
                    break;
            }
        }
        return res[len];
    }
}