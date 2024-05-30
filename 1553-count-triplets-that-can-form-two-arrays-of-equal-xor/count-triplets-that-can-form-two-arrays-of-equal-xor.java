class Solution {
    public int countTriplets(int[] arr) {
        int cnt = 0;
        int a = 0;
        int b = 0;
        int len  = arr.length;
        for(int i = 0;i < len;i++){
            a = 0;
            for(int j = i+1;j<len;j++){
                b = 0;
                a ^= arr[j-1];
                for(int k = j;k<len;k++){
                    b ^= arr[k];
                    if(a == b){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}