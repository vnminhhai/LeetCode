class Solution {
    static int[] c=new int[26];
    public boolean makeEqual(String[] words) {
        Arrays.fill(c,0);
        for (String s: words) {
            for (char ch:s.toCharArray()) {
                c[ch-'a']++;
            }
        }
        for (int i : c) {
            if (i%words.length!=0) return false;
        }
        return true;
    }
}