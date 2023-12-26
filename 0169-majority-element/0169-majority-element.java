class Solution {
    static HashMap<Integer,Integer> m;
    static Integer max;
    public int majorityElement(int[] nums) {
        m=new HashMap<>();
        max=nums[0];
        for (Integer i:nums) {
            int count = m.getOrDefault(i, 0) + 1;
            m.put(i, count);
            if (count>m.get(max)) max=i;
        }
        return max;
    }
}