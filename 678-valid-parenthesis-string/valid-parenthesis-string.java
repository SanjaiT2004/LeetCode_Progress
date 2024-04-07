class Solution {
    public boolean checkValidString(String s) {
        int cnt1 = 0;
        int cnt2 = 0;
        for(char c : s.toCharArray()){
           cnt1+= c=='(' ?1:-1;
           cnt2+= c!=')' ?1:-1;
            if(cnt2 < 0)
            break;
            cnt1 = Math.max(cnt1,0);
        }
        return cnt1 == 0;
    }
}