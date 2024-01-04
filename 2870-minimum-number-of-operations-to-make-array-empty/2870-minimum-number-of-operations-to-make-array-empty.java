class Solution {
    static HashMap<Integer, Integer> count;
    public int minOperations(int[] nums) {
        count= new HashMap<>();
        for (int i: nums) {
            count.put(i,count.getOrDefault(i,0)+1);
        }
        int res=0;
        for (Integer i: count.keySet()) {
            int f=count.get(i);
            if (f==1) return -1;
            if (f%3==0) res+=f/3;
            else {
                res+=f/3+1;
            }
        }
        return res;
    }
}