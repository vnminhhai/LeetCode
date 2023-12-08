class Solution {
    public int removeDuplicates(int[] nums) {
        int t=nums.length, mark=nums[0], mark_index=1;
        if (t<2) return 1;
        for (int i=1; i<t; i++) {
            if (nums[i]!=mark) {nums[mark_index]=nums[i]; mark=nums[i]; ++mark_index;}
        }
        return mark_index;
    }
}