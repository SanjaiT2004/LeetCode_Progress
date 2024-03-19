class Solution {
    public int movesOfEachBox(StringBuilder sb,int idx,int len){
        int left = idx - 1;
        int right = idx + 1;
        int moves = 0;
        while(left >=0 || right <len){
            if(left >=0 && sb.charAt(left) == '1')
                moves += idx - left;
            if(right < len && sb.charAt(right) == '1')
                moves += right - idx;
                left --;
                right++;
        }
        return moves;
    }
    public int[] minOperations(String s) {
        int len = s.length(); 
        int arr[] = new int[len];
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i<len;i++){
            arr[i] = movesOfEachBox(sb,i,len);
        }
        return arr;
    }
}