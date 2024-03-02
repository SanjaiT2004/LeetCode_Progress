class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cnt = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i) == '1')
                cnt++;
        }
        if(cnt == 0)
            return s;
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        len--;
        while(i < len){
            if(cnt > 1)
                sb.append('1');
            else
                sb.append('0');
            cnt--;
            i++;
        }
        sb.append('1');
        return sb.toString();
    }
}