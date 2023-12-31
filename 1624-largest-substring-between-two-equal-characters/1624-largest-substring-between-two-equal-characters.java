class Solution {
    static int[] a= new int[26];
    public int maxLengthBetweenEqualCharacters(String s) {
        Arrays.fill(a,300);
        int res=-1;
        for (int i=0; i<s.length(); i++) {
            a[s.charAt(i)-'a']=Math.min(a[s.charAt(i)-'a'],i);
            res=Math.max(i-a[s.charAt(i)-'a']-1,res);
        }
        return res;
    }
}