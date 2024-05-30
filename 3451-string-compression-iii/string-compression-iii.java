class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int len = word.length();
        int cnt = 1;
        char ch = word.charAt(0);
        if(len == 1){
            return 1+""+word;
        }
        char arr[] = word.toCharArray();
        int i = 0;
        for(i = 1;i<len;i++){
            if(arr[i] == ch){
                cnt++;
                if(cnt >= 9){
                    sb.append(cnt);
                    sb.append(ch);
                    cnt = 0;
                }
            }else{
                if(cnt != 0)  
                sb.append(cnt).append(arr[i-1]);
                ch = arr[i];
                cnt = 1;
            }
        }
        if(cnt != 0)
          sb.append(cnt).append(arr[len - 1]);
        return sb.toString();
    }
}