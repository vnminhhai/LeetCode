class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len=nums.length, min_dif=14000;
        for (int i=0; i<len-2; i++) {
            int l=i+1, r=len-1, sum=nums[i]+nums[l]+nums[r];
            while (l<r) {
                sum=nums[i]+nums[l]+nums[r];
                if (sum==target) return target;
                if (Math.abs(target-sum)<Math.abs(min_dif)) min_dif=sum-target; 
                if (sum>target) --r;
                else ++l;
            }  
        }
        return target+min_dif;
    }
}