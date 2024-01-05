class Solution {
    static int res[];
    public int lengthOfLIS(int[] nums) {
        res= new int[nums.length];
        Arrays.fill(res,1);
        for (int i=1; i<nums.length; i++) {
            for (int j=i-1; j>=0; j--) {
                if (nums[i]>nums[j]) res[i]=Math.max(res[j]+1,res[i]);
            }
        }
        return Arrays.stream(res).max().orElse(0);
    }
}