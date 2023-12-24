class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int i : nums) {
            if (!h.add(i)) h.remove(i);
        }
        return h.iterator().next();
    }
}