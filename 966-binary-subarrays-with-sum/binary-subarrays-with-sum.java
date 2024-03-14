class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int cnt = 0;
        int len = nums.length;
        int sum = 0;
        for(int i = 0;i<len;i++){
            sum = 0;
            for(int j = i;j<len;j++){
                sum += nums[j];
                if(sum == goal)
                cnt++;
            }
        }
        return cnt;
    }
}