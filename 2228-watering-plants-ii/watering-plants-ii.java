class Solution {
    public int minimumRefill(int[] nums, int capacityA, int capacityB) {
        int i = 0;
        int j = nums.length - 1;
        int c1 = capacityA;
        int c2 = capacityB;
        int cnt1 = 0;
        while( i < j){
            if(nums[i] > c1){
                c1 = capacityA;
                cnt1++;
            }
            if(nums[j] > c2){
                c2 = capacityB;
                cnt1++;
            }
            c2 -= nums[j];
            c1 -= nums[i];
            i++;
            j--;
        }
        if(i==j&&nums[i] > Math.max(c1,c2) )cnt1++;
        return cnt1;
    }
}