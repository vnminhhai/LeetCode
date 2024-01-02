class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        int cur_list=0;
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<nums.length;) {
            int cur_val=nums[i];
            while (i<nums.length&&nums[i]==cur_val) {
                if (cur_list>=res.size())
                    res.add(new ArrayList<>());
                res.get(cur_list).add(nums[i++]);
                cur_list++;
            }
            cur_list=0;
        }
        return res;
    }
}