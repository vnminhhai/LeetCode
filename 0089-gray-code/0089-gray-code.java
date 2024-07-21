class Solution {
    List<Integer> list;
    public List<Integer> grayCode(int n) {
        list= new ArrayList<>();
        list.add(0);
        int times = (int)(pow(2,n));
        for (int i=1; i<times; i++) {
            list.add(list.get(opp(i))^helper(i));
            // list.add(helper(i));
        }
        return list;
    }
    int helper(int i) {
        return  pow(2,(int)Math.ceil(Math.log(i+1)/Math.log(2))-1);
    }
    int opp(int i) {
        return helper(i)*2-1-i;
    }
    int pow (int a, int b)
    {
        if (b == 0)     return 1;
        if (b == 1)     return a;
        if (b%2==0)  return     pow (a * a, b/2);     //even a=(a^2)^b/2
        else            return a * pow (a * a, b/2);     //odd  a=a*(a^2)^b/2

    }
}