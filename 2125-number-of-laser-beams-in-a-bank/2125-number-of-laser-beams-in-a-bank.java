class Solution {
    public int numberOfBeams(String[] bank) {
        int m=bank.length, prev=-1, res=0;
        for (int i=0; i<m; i++) {
            int count=0;
            for (char c : bank[i].toCharArray()) {
                if (c=='1') count++;
            }
            if (prev==-1) {
                if (count!=0) prev=count;
                else continue;
            }
            else {
                if (count!=0) {
                    res+=count*prev;
                    prev=count;
                }
            }
        }
        return res;
    }
}