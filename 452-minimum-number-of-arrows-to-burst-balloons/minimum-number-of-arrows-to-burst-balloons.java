class Solution {
    public int findMinArrowShots(int[][] arr) {
        Arrays.sort(arr,(a,b) -> Integer.compare(a[1] ,b[1]));
        int start = arr[0][1];
        int cnt = 1;
        for(int i=1;i<arr.length;i++){
           if(arr[i][0] <= start)
           continue;
           else{
               cnt++;
               start = arr[i][1];
           }
        }
       return cnt;
    }
}