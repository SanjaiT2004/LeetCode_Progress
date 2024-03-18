class Solution {
    public int numOfPairs(String[] nums, String target) {
        int cnt = 0;
        int len = nums.length;
        for(int i = 0;i<len;i++){
            for(int j = i + 1;j<len;j++){
                if(target.equals(nums[i] + nums[j]))
                    cnt++;
                if(target.equals(nums[j] + nums[i]))
                cnt++;
            }
        }
        return cnt;
    }
}