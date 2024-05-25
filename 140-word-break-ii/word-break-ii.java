class Solution {
    List<String> list;
    public void backtrack(String s,StringBuilder sb,Set<String> dict,int start,int length){
        if(start == length){
            list.add(sb.toString().trim());
        }
        for(int i=start;i<s.length();i++){
            if(dict.contains(s.substring(start,i+1))){
                sb.append(s.substring(start,i+1));
                sb.append(" ");
                backtrack(s,sb,dict,i+1,length);
                int val = i+2 - start;
                sb.delete(sb.length()-val,sb.length());
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        list = new ArrayList<>();
     Set<String> set = new HashSet<>();
     int len = wordDict.size();
     for(int i=0;i<len;i++){
        set.add(wordDict.get(i));
     }
     backtrack(s,new StringBuilder(""),set,0,s.length());
        return list;
    }
}