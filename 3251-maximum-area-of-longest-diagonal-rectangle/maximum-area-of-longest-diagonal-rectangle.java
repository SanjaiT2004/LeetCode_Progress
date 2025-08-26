class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0d;
        int area = 0;
        double diag = 0d;
        for(int[] arr : dimensions){
            diag = Math.sqrt(arr[0] * arr[0] + arr[1] * arr[1]);
            if(max < diag){
                max = diag;
                area = arr[0] * arr[1];
            }
            else if(max == diag){
                area = Math.max(area,arr[0] * arr[1]);
            }
        }
    return area;
    }
}