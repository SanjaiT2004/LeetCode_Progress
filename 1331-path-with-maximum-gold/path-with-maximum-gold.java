class Solution {
    int max = 0;
    public void backtrack(int[][] arr,int i,int j,int sum){
        if(i < 0 || i>=arr.length || j<0 || j >= arr[0].length || arr[i][j] == 0){
            return ;
        }
        sum += arr[i][j];
        max = Math.max(max,sum);
        int k = arr[i][j];
        arr[i][j] = 0;
        backtrack(arr,i+1,j,sum);
        backtrack(arr,i-1,j,sum);
        backtrack(arr,i,j+1,sum);
        backtrack(arr,i,j-1,sum);
        arr[i][j] = k;
    }
    public int getMaximumGold(int[][] grid) {
         max = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                backtrack(grid,i,j,0);
            }
        }
        return max;
    }
}