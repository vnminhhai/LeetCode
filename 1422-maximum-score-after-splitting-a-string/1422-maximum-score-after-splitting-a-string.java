class Solution {
    public int maxScore(String s) {
        int res=0, l=s.length(),max, po=0,pz=0,z=0,o=0;
        if (s.charAt(l-1)=='1') ++res;
        if (s.charAt(0)=='0') ++res;
        max=res;
        for (int i=1; i<l-1; i++) {
            if (s.charAt(i)=='0') ++z;
            else ++o;
        }
        max=Math.max(res+pz+(o-po),max);
        for (int i=1; i<l-1; i++) {
            if (s.charAt(i)=='0') ++pz;
            else ++po;
            max=Math.max(res+pz+(o-po),max);
        }
        return max;
    }
}