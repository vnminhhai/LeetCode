class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1, max;
        max=Math.min(height[left],height[right])*(right-left);
        while (left<right) {
            if (height[left]>height[right]) {
                max=Math.max(max, height[right]*(right-left));
                --right;
            }
            else {
                max=Math.max(max, height[left]*(right-left));
                ++left;
            }
        }
        return max;
    }
}