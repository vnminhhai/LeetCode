class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss=s.toCharArray(), ts=t.toCharArray();
        Arrays.sort(ts);
        Arrays.sort(ss);
        return (String.valueOf(ss).equals(String.valueOf(ts)));        
    }
}