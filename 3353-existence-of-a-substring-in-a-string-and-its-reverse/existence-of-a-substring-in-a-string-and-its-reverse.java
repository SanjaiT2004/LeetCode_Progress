class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        int len = s.length();
        for(int i = 0;i<=len;i++){
            if(i+2 <= len)
            {
                if(s1.contains(s.substring(i,i+2)))
                    return true;
            }
        }
        return false;
    }
}