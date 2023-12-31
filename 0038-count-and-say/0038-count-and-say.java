class Solution {
    static String[] a=new String[31];
    public String countAndSay(int n) {
        a[1]="1";
        a[2]="11";
        for (int i=3; i<=n; i++) {
            if (a[i]!=null) continue;
            StringBuilder r= new StringBuilder("");
            int count;
            String cur= a[i-1];
            for (int j=0; j<cur.length();j++) {
                count =1;
                while (j<cur.length()-1&&cur.charAt(j+1)==cur.charAt(j)) {++j; ++count;}
                r.append(count);
                r.append(cur.charAt(j));
            }
            a[i]=r.toString();
        }
        
        return a[n];
    }
}