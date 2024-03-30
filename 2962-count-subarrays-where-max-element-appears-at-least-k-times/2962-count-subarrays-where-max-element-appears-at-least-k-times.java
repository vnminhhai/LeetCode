class Solution {
    public long countSubarrays(int[] nums, int k) {
        long res =0;
        int max = nums[0];
        for (int i:nums) {
            if (i>max) max=i;
        }
        int i=0,i2,t=0;
        while (i<nums.length&&nums[i]!=max) i++;
        if (i>=nums.length) return 0;
        i2=i;
        for (int j=0; j<k; j++) {
            if (i2>=nums.length&&j!=k-1) return 0;
            while (i2<nums.length&&nums[i2]!=max) i2++;
            i2++;
        }
        i2--;
        while (i2<nums.length) {
            res+=helper(i-t,i2-t,nums.length-t);
            t=i+1;
            do i++; while (i<nums.length&&nums[i]!=max);
            do i2++; while (i2<nums.length&&nums[i2]!=max); 
        }
        return res;
    }
    long helper (int i, int j, int n){
        return ((long)i+1)*(n-j);
    }
}