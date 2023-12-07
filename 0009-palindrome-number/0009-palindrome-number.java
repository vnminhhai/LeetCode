class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder(x+"");
        String c=new String(x+"");
        return (c.equals(s.reverse().toString()));
    }
}