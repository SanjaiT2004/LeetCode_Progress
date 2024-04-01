class Solution {
    public int lengthOfLastWord(String s) {
        String st=s.trim();
        int n=0;
        
        for(int i=st.length()-1;i>=0;i--){
            if(st.charAt(i)==' '){
                return n;
            }else{
                n++;
            }
        }
        return n;
    }
}