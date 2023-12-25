class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len=nums.length;
        for (int t=0; t<len-3; t++) {
            if (nums[t]>target&&nums[t]>0) break;
            if(t>0 && nums[t]==nums[t-1]) continue;
            for(int i=t+1; i<len-2; i++){
                if(i>t+1 && nums[i]==nums[i-1]) continue;
                int l = i+1;
                int r = len-1;
                while(l<r){
                    int sum = nums[t]+ nums[i] + nums[l] + nums[r];
                    if(sum>target){
                        r--;
                    }
                    else if(sum < target){
                        l++;
                    } else{
                        res.add(Arrays.asList(nums[t], nums[i], nums[l], nums[r]));
                        int curr_l = nums[l];
                        int curr_r = nums[r];
                        // de-duping
                        while(l<r && nums[l]==curr_l){
                            l++;
                        }
                        while(l<r && nums[r]==curr_r){
                            r--;
                        }
                    }
                }
            }
        }
        return res;
    }
}