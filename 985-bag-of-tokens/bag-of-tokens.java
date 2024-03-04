class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int cnt = 0;
        int len = tokens.length;
        int i = 0;
        int j = len - 1;
        Arrays.sort(tokens);
        while(i <= j){
            if(tokens[i] <= power){
                power -= tokens[i++];
                cnt++;
            }
            else if(cnt > 0){
                if( j - i <= 0)
                break;
                power += tokens[j--];
                cnt--;
            }else{
                break;
            }
        }
        return cnt;
    }
}