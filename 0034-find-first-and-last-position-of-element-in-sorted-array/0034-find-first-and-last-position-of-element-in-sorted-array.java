class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l= nums.length, resl=-1, resr=-1;
        if (l==0) return new int[]{-1, -1};
        if (nums[l-1]<target) return new int[]{-1, -1};
        if (nums[0]>target) return new int[]{-1, -1};
        int left = 0, right = l-1;
        while (left<=right)
        {
            int mid = (left+right)/2;
            if (nums[mid]>target) right=mid-1;
            else if (nums[mid]<target) left =mid+1;
            else {
                resl=resr=mid;
                if (nums[l-1]==target) resr=l-1; else
                if (resr<l-1)
                while (nums[resr+1]==target||nums[resr]!=target) {
                    mid = (resr+right)/2;
                    if (nums[mid]>target) right=mid-1;
                    else {
                        resr=mid+1;
                    }
                    if (nums[resr]!=target&&nums[resr-1]==target) {
                        resr--;
                        break;
                    }
                }
                if (nums[0]==target) resl=0; else
                if (resl>0) while (nums[resl-1]==target||nums[resl]!=target) {
                    mid = (resl+left)/2;
                    if (nums[mid]>=target) {
                        resl=mid-1;
                    }
                    else {
                        left=mid+1;
                    }
                    if (nums[resl]!=target&&nums[resl+1]==target) {
                        resl++;
                        break;
                    }
                }
                break;
            }
        }
        return new int[]{resl, resr};
    }
}