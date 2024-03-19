class Solution {
    public void dfs(char[][] arr,int i,int j){
        if(i < 0 || i>=arr.length || j<0 || j >= arr[0].length || arr[i][j] == '.'){
            return ;
        }
        arr[i][j] = '.';
        dfs(arr,i+1,j);
        dfs(arr,i-1,j);
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);
    }
    public int countBattleships(char[][] board) {
       int cnt = 0;
       int rSize = board.length;
       int cSize = board[0].length;
       for(int i =0;i<rSize;i++){
            for(int j = 0;j<cSize;j++){
                if(board[i][j] == 'X'){
                    dfs(board,i,j);
                    cnt++;    
                }
            }
       }
       return cnt;
    }
}