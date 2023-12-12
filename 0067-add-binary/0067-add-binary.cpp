class Solution {
public:
    string addBinary(string a, string b) {
        bool c=false;
        short i, la=a.length(), lb=b.length();
        string s="";
        for (i=1; i<=min(la,lb); i++) {
            if (a[la-i]==b[lb-i]) {
                if (a[la-i]=='1') {
                    if (c) s="1"+s;
                    else s="0"+s;
                    c=true;
                }
                else {
                    if (c) s="1"+s;
                    else s="0"+s;
                        c=false;
                }
            }
            else if (c) s="0"+s;
            else {s="1"+s; c=false;}
        }
        if (la>lb) {
            for (i=la-lb-1; i>=0; i--) {
                if (a[i]=='1') {
                    if (c) s="0"+s;
                    else {
                        s="1"+s;
                    }
                }
                else {
                    if (c) {s="1"+s; c=false;}
                    else {
                        s="0"+s;
                    }
                }  
            }
        }
        else {
            for (i=lb-la-1; i>=0; i--) {
                if (b[i]=='1') {
                    if (c) s="0"+s;
                    else {
                        s="1"+s;
                    }
                }
                else {
                    if (c) {s="1"+s; c=false;}
                    else {
                        s="0"+s;
                    }
                }
            }
        }
        s= c? "1"+s : s;
        return s;
    }
};