class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result="";
        int index=-1,maxl=200;
        for (String s: strs) {
            maxl= Math.min(maxl,s.length());
        }
        for (int i=0; i< maxl; ++i) {
            for (int j=0; j<strs.length; ++j) {
                if (strs[j].charAt(i)!=strs[0].charAt(i)) {if (index>=0) index=Math.min(i,index); else index=i; break;}
                else if (i==maxl-1) {if (index>=0) Math.min(i+1,index); else index=i+1;}
            }
        }
        if (index>=0) result+=strs[0].substring(0,index);
        return result;
    }
}