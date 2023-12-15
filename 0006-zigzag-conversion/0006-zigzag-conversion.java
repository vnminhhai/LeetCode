class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1) return s;
        String st[] = new String[numRows], r="";
        short t=0;
        boolean tang = false;
        for (int i=0; i<numRows; i++) {
            st[i]="";
        }
        for (int i=0; i<s.length(); i++) {
            st[t]+=s.charAt(i);
            if (i%(numRows-1)==0) tang=!tang;
            if (tang) ++t;
            else --t;
        }
        for (int i=0; i<numRows; i++) {
            r+=st[i];
        }
        return r;
    }
}