class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0")||num2.equals("0")) return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        int[] values = new int[len1+len2];
        StringBuilder res = new StringBuilder();
        for (int i=1; i<len1+len2; i++) {
            int j=0;
            int k=i-j-1;
            while (k>=0&&j<len1) {
                if (k>=len2) {j++; k--; continue;}
                values[i]+=(num1.charAt(j++)-'0')*(num2.charAt(k--)-'0');
            }
            // j=i-1;
            // k=i-j-1;
            // while (k>=0&&j<len1) {
            //     if (k>=len2) {j++; k--; continue;}
            //     values[i]+=(num1.charAt(j++)-'0')*(num2.charAt(k--)-'0');
            // }
        }
        for (int i= len1+len2-1; i>=0; i--) {
            if (i==0&&values[i]==0) break;
            if (values[i]>9) {
                values[i-1]+=values[i]/10;
                values[i]=values[i]%10;
            }
            res.append(values[i]);
        }
        return res.reverse().toString();
    }
}