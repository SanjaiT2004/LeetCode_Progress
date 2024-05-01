class Solution {
    public String reversePrefix(String s, char ch) {
        int n=s.indexOf(ch);
        if(n==-1)
        return s;
        else{
        StringBuffer sb=new StringBuffer(s.substring(0,n+1));
        //System.out.print(st);
    String str="";
    str+=sb.reverse();
    str+=s.substring(n+1);
        return str;
        }
    }
}