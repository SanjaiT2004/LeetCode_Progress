class Solution {
    public long countSubarrays(int[] nums, int k) {
        long cnt = 0;
        int j = 0;
        int len = nums.length;
        int max = 0;
        for(int n : nums)
            max = Math.max(max,n);
        int max_cnt = 0;
        for(int i = 0;i < len ;i++){
            if(nums[i] == max)
                max_cnt++;
            while(max_cnt >= k ){
                if(nums[j] == max)
                    max_cnt--;
                j++;
                cnt += len - i;
            }   
        }
        return cnt;
    }
}