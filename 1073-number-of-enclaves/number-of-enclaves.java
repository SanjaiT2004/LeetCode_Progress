class Solution {
    boolean flag;
    int cnt;
    public void dfs(int [][] arr,int i,int j){
        if(i < 0 || i>=arr.length || j<0 || j >= arr[0].length || arr[i][j] == 0){
            return ;
        }
        if(i == 0 || i == arr.length -1 || j == 0 || j == arr[0].length-1)
            flag = false;
        cnt++;
        arr[i][j] = 0;
        dfs(arr,i+1,j);
        dfs(arr,i-1,j);
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);
    }
    public int numEnclaves(int[][] grid) {
        int rSize = grid.length;
        int cSize = grid[0].length;
        cnt = 0;
        int sum = 0;
        for(int i = 0;i<rSize;i++){
            for(int j = 0;j<cSize;j++){
                if(grid[i][j] == 1){
                    flag = true;
                    cnt = 0;
                    dfs(grid,i,j);
                    if(flag){
                        sum += cnt;
                    }
                }
            }
        }
        return sum;
    }
}