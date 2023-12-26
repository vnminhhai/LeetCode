class Solution {
    static List<String> res;
    public List<String> generateParenthesis(int n) {
        res=new ArrayList<>();
        r(res,0,0,n,"");
        return res;
    }
    void r(List<String> res, int left, int right, int n, String s) {
        if (s.length()==n*2) {res.add(s); return;}
        if (left<n) r(res, left+1, right, n, s+'(');
        if (left>right) r(res, left, right+1, n, s+')');
    }
}