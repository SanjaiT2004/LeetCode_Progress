class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt = 0;
        int len = nums.length;
        long pro = 1;
        for(int i = 0;i<len;i++){
            pro =1;
            for(int j = i;j<len;j++){
                pro *= nums[j];
                if(pro < k)
                    cnt++;
                    else
                    break;
            }
        }
        return cnt;
    }
}