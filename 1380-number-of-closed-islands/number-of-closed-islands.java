class Solution {
    public void dfs(int[][] arr,int i,int j){
        if(i < 0 || i>=arr.length || j<0 || j >= arr[0].length || arr[i][j] != 0){
            return ;
        }
        arr[i][j] = 2;
        dfs(arr,i+1,j);
        dfs(arr,i-1,j);
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);
    }
    public int closedIsland(int[][] grid) {
        int cnt = 0;
        int rSize = grid.length;
        int cSize = grid[0].length;
        for(int i = 0;i<rSize;i++){
            for(int j = 0;j<cSize;j++){
                if(grid[i][j] == 0 && (i == 0 || i == rSize -1 || j == 0 || j == cSize-1))
                    dfs(grid,i,j);
            }
        }
        for(int i = 0;i<rSize;i++){
            for(int j = 0;j<cSize;j++){
                if(grid[i][j] == 0){
                    dfs(grid,i,j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}