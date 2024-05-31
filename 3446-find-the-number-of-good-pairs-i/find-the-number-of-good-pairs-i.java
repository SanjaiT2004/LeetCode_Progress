class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int cnt = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        for(int i = 0;i<len1;i++){
            for(int j = 0;j<len2;j++){
                if(nums1[i] % (nums2[j] * k) == 0)
                    cnt++;
            }
        }
        return cnt;
    }
}