class Solution {
    public int[][] matrixBlockSum(int[][] nums, int k) {
        int rSize = nums.length;
        int cSize = nums[0].length;
        int dp[][] = new int[rSize][cSize];
        for(int i = 1;i<cSize;i++){
            nums[0][i] += nums[0][i-1];
        }
            int down = 0;
            int up = 0;
            int left = 0;
            int right = 0;
        for(int i = 1;i<rSize;i++){
            for(int j= 0;j<cSize;j++){
                if( j == 0)
                    nums[i][j]+= nums[i-1][j];
                else
                    nums[i][j] =nums[i][j] + nums[i-1][j] + nums[i][j-1]  - nums[i-1][j-1];
            }
        }
         int upleftSum = 0;
         int downrightSum = 0;
         int downleftSum = 0;
        for(int i = 0;i<rSize;i++){
                down = i-k-1;
                up = i+k >= rSize? rSize - 1:i+k;
            for(int j = 0;j<cSize;j++){
                left = j - k-1 ;
                right = j + k >= cSize? cSize - 1:j+k;
                downleftSum = down < 0 || left < 0?0:nums[down][left];
                downrightSum = down <0 || right >= cSize ? 0 : nums[down][right];
                upleftSum = up >= rSize || left < 0 ? 0 : nums[up][left];   
                dp[i][j] = nums[up][right] - upleftSum - downrightSum + downleftSum; 
            }
        }
        return dp;
    }
}