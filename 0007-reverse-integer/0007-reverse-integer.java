class Solution {
    public int reverse(int x) {
        if (x==Integer.MIN_VALUE) return 0;
        boolean m = x<0;
        ArrayDeque<Integer> s = new ArrayDeque<>();
        if (m) x=-x;
        while (x>0) {
            s.add(x%10);
            x/=10;
        }
        while (!s.isEmpty()) {
            if (x>214748364) return 0;
            if (x==214748364)
                if (m) 
                {
                    if (s.peekFirst()>8) return 0;
                }
                else {
                    if (s.peekFirst()>7) return 0;
                }
                    
            x=x*10+s.removeFirst();
        }
        if (m) return -x;
        else return x;
    }
}