class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if (len<2) return nums[0];
        int[] res = new int[len];
        Arrays.fill(res, -1);
        res[0] = nums[0];
        res[1] = Math.max(nums[0],nums[1]);
        for (int i=2; i<len; i++) {
            res[i]=Math.max(res[i-2]+nums[i], res[i-1]);
        }
        return res[len-1];
    }
}