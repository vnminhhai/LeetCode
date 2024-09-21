class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int length = nums.length;
        int arr[] = new int[length];
        for (int i=0; i<length; i++) {
            arr[i]=nums[i];
        }
        for (int i=1; i<length; i++) {
            arr[i]=Math.max(arr[i],arr[i-1]+nums[i]);
            max=Math.max(arr[i],max);
        }
        return max;
    }
}