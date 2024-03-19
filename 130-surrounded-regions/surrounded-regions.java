class Solution {
    public void dfs(char[][] arr,int i,int j){
        if(i < 0 || i>=arr.length || j<0 || j >= arr[0].length || arr[i][j] != 'O'){
            return ;
        }
        arr[i][j] = 'P';
        dfs(arr,i+1,j);
        dfs(arr,i-1,j);
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);
    }
    public void solve(char[][] board) {
        int rSize = board.length;
        int cSize = board[0].length;
        for(int i = 0;i<rSize;i++){
            for(int j = 0;j<cSize;j++){
                if(board[i][j] == 'O'&& (i == 0 || i == rSize -1 || j == 0 || j == cSize-1))
                    dfs(board,i,j);
            }
        }
        for(int i = 0;i<rSize;i++){
            for(int j = 0;j<cSize;j++){
                if(board[i][j] == 'P')
                    board[i][j] = 'O';
                else if(board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }
}
// class Solution {
//     boolean flag;
//     public void dfs(char[][] arr,int i,int j){
//         if(i < 0 || i>=arr.length || j<0 || j >= arr[0].length || arr[i][j] == 'X'){
//             return ;
//         }
//         if(i == 0 || i == arr.length -1 || j == 0 || j == arr[0].length-1)
//             flag = true;
//         arr[i][j] = 'X';
//         dfs(arr,i+1,j);
//         dfs(arr,i-1,j);
//         dfs(arr,i,j+1);
//         dfs(arr,i,j-1);
//         if(flag){
//             System.out.println(i+" "+j);
//             arr[i][j] = 'O';
//         }
//     }
//     public void solve(char[][] board) {
//         int rSize = board.length;
//         int cSize = board[0].length;
//         for(int i = 0;i<rSize;i++){
//             for(int j = 0;j<cSize;j++){
//                 if(board[i][j] == 'O'){
//                     flag = false;
//                     dfs(board,i,j);
//                     if(flag){
//                         board[i][j] = 'O';
//                         System.out.println();
//                     }
//                 }
//             }
//         }
//     }
// }