class Solution {
    public int romanToInt(String s) {
        s+=" ";
        int r=0,p=0;
        while (p<s.length()-1) {
            if (s.charAt(p)=='M') {r+=1000; ++p;}
            else if (s.charAt(p)=='D') {r+=500; ++p;}
            else if (s.charAt(p)=='C') if (s.charAt(p+1)=='M'||s.charAt(p+1)=='D') {r-=100; ++p;} else {r+=100; ++p;}
            else if (s.charAt(p)=='L') {r+=50; ++p;}
            else if (s.charAt(p)=='X') if (s.charAt(p+1)=='L'||s.charAt(p+1)=='C') {r-=10; ++p;} else {r+=10; ++p;}
            else if (s.charAt(p)=='V') {r+=5; ++p;}
            else if (s.charAt(p)=='I') if (s.charAt(p+1)=='X'||s.charAt(p+1)=='V') {r-=1; ++p;} else {++r; ++p;}
        }
        return r;
    }
}