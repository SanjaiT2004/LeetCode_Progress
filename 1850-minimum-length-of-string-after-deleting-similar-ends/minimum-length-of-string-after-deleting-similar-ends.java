class Solution {
    public int minimumLength(String s) {
        int len = s.length();
        int i = 0;
        char prev = '.';
        int j = len - 1 ;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                prev = s.charAt(i);
               while(i<=j && s.charAt(i) == prev)
                i++;
                while(i<=j && s.charAt(j) == prev)
                j--;
            }
            else
            break;
        }
        return j-i + 1;
    }
}