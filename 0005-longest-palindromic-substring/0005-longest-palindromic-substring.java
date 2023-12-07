class Solution {
    public String longestPalindrome(String s) {
        int res=1, index=0;
        boolean e=false;
        for (int i=0; i<s.length(); i++) {
            int t = max_length_with_mid(s, i);
            if (2*t+1>res) {
              res=2*t+1;
              index=i;
              e=false;
            }
            t = max_length_with_2mid(s, i);
            if (i!=s.length()-1&&s.charAt(i)==s.charAt(i+1))
            if (2*t+2>res) {
              res=2*t+2;
              index=i;
              e=true;
            }
        }
        return e? s.substring(index-res/2+1, index+res/2+1) : s.substring(index-(res-1)/2, index+(res-1)/2+1);
    }
    int max_length_with_2mid(String s, int mid) {
        int max=0, loops=Math.min(s.length()-mid-1,mid+1);
        for (int i=1; i<loops; i++) {
            if(s.charAt(mid+i+1)==s.charAt(mid-i)) ++max;
            else break;
        }
        return max;
    }
    int max_length_with_mid(String s, int mid) {
        int max=0, loops=Math.min(s.length()-mid,mid+1);
        for (int i=1; i<loops; i++) {
            if(s.charAt(mid+i)==s.charAt(mid-i)) ++max;
            else break;
        }
        return max;
    }
}