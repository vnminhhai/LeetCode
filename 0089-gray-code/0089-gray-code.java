class Solution {
    List<Integer> list;
    public List<Integer> grayCode(int n) {
        list= new ArrayList<>();
        list.add(0);
        int times = (int)(Math.pow(2,n));
        for (int i=1; i<times; i++) {
            list.add(list.get(opp(i))^helper(i));
        }
        return list;
    }
    int helper(int i) {
        int c =0;
        while (i>0) {i/=2; c++;}
        return (int)(Math.pow(2,c-1));
    }
    int opp(int i) {
        return helper(i)*2-1-i;
    }
}