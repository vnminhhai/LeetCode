class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len=nums.length;
        for(int i=0; i<len; i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l = i+1;
            int r = len-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum>0){
                    r--;
                }
                else if(sum < 0){
                    l++;
                } else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    int curr_l = nums[l];
                    int curr_r = nums[r];
                    // required for de-duping
                    while(l<r && nums[l]==curr_l){
                        l++;
                    }
                    while(l<r && nums[r]==curr_r){
                        r--;
                    }
                }
            }
        }
        return res;
    }
}