class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int k = len - 1;
        len/=2;
        char ch = ' ';
        for(int i = 0;i<len;i++,k--){
            ch = s[i];
            s[i] = s[k];
            s[k] = ch;
        }
    }
}