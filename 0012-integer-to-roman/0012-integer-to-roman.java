class Solution {
    public String intToRoman(int num) {
        String res="";
        switch ((int) Math.log10(num)) {
            case 3:
                int c=num/1000;
                num=num%1000;
                while (c-->0) {
                    res+="M";
                }
            case 2:
                c=num/100;
                num=num%100;
                if (c==4||c==9) { res+= (c==4) ? "CD" : "CM"; c=0; }
                else if (c>=5) { res+="D"; c-=5; }
                while (c-->0) {
                    res+="C";
                }
            case 1:
                c=num/10;
                num=num%10;
                if (c==4||c==9) { res+= (c==4) ? "XL" : "XC"; c=0; }
                else if (c>=5) { res+="L"; c-=5; }
                while (c-->0) {
                    res+="X";
                }
            default:
                c=num%10;
                if (c==4||c==9) { res+= (c==4) ? "IV" : "IX"; c=0; }
                else if (c>=5) { res+="V"; c-=5; }
                while (c-->0) {
                    res+="I";
                }
        }
        return res;
    }
}