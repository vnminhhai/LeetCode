class Solution {
    static List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res=new ArrayList<>();
        Arrays.sort(candidates);
        find(candidates,target,0,new ArrayList<Integer>(),res);
        return res;
    }
    void find(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> res) {
        if (target<=0||index>=candidates.length) return;
        for (int i=index; i<candidates.length; i++) {
            if (target==candidates[i]) {
                current.add(target);
                res.add(current);
                return;
            }
            else {
                List<Integer> new_list= new ArrayList<>(current);
                new_list.add(candidates[i]);
                find(candidates, target-candidates[i], i, new_list, res);
            }
        }
    }
}