class Solution {
    int max = 0;
    int sum = 0;
    public void backtrack(int[][] arr,int i,int j){
        if(i < 0 || i>=arr.length || j<0 || j >= arr[0].length || arr[i][j] == 0){
            return ;
        }
        sum++;
        max = Math.max(max,sum);
        arr[i][j] = 0;
        backtrack(arr,i+1,j);
        backtrack(arr,i-1,j);
        backtrack(arr,i,j+1);
        backtrack(arr,i,j-1);
    }
    public int maxAreaOfIsland(int[][] grid) {
         max = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    sum = 0;
                backtrack(grid,i,j);
                }
            }
        }
        return max;
    }
}