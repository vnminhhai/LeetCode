class Solution {
    static List<List<Integer>> res;
    static List<Integer> used;
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        used=new ArrayList<>();
        recurse(nums);
        return res;
    }
    void recurse(int[] nums) {
        if (used.size()==nums.length) {res.add(new ArrayList(used)); return;}
        for (int i:nums) {
            if (!used.contains(i)) {
                used.add(i);
                recurse(nums);
                used.remove(used.size()-1);
            }   
        }
    }
}