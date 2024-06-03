class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        int len1 = s.length();
        int len2 = t.length();
        while(i < len1 && j < len2){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return len2 - j;
    }
}