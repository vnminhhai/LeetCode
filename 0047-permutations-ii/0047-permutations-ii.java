class Solution {
    static List<List<Integer>> res;
    static List<Integer> numList;
    static HashMap<Integer, Integer> counter;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        numList = new ArrayList<>();
        counter = new HashMap<>();
        for (int num : nums) {
            if (!counter.containsKey(num))
                counter.put(num, 0);
            counter.put(num, counter.get(num) + 1);
        }
        recurse(nums.length);
        return res;
    }
    void recurse(int l) {
        if (numList.size()==l) {res.add(new ArrayList(numList)); return;}
        for (Integer i: counter.keySet()) {
            if (counter.get(i)>0) {
                numList.add(i);
                counter.put(i, counter.get(i)-1);
                recurse(l);
                counter.put(i, counter.get(i)+1);
                numList.remove(numList.size()-1);
            }   
        }
    }
}