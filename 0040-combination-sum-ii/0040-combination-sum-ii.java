class Solution {
    static List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res=new ArrayList<>();
        Arrays.sort(candidates);
        find(candidates,target,0,new ArrayList<Integer>(),res);
        return res;
    }
    void find(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> res) {
        if (target==0) {
            res.add(new ArrayList<>(current));
            return;
        }
        if (target<0||index>=candidates.length) return;
        for (int i=index; i<candidates.length; i++) {
            if (i>index&&candidates[i]==candidates[i-1]) continue;
            current.add(candidates[i]);
            find(candidates, target-candidates[i], i+1, current, res);
            current.remove(current.size()-1);
        }
    }
}