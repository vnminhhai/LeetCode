class Solution {
    public int compress(char[] chars) {
        int cur=0;
        for (int i=0; i<chars.length; i++) {
            int c=1;
            while (i<chars.length-1&&chars[i+1]==chars[i]) {++i; ++c;}
            chars[cur++]=chars[i];
            if (c>=1000) {
                chars[cur++]=Character.forDigit(c/1000,10);
            } 
            if (c>=100) {
                chars[cur++]=Character.forDigit(c/100%10,10);
            }
            if (c>=10) {
                chars[cur++]=Character.forDigit(c/10%10,10);
            }
            if (c>=2) {
                chars[cur++]=Character.forDigit(c%10,10);
            }
        }
        return cur;
    }
}