class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        for(List<String> list : knowledge){
            map.put(list.get(0),list.get(1));
        }
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        int len = s.length();
        int k = 0;
        while(i < len){
            if(s.charAt(i) == '('){
                k = i+1;
                while(i<len && s.charAt(i)!=')'){
                    i++;
                }
                i--;
            }else if(s.charAt(i) == ')'){
                String s1 = s.substring(k,i);
                sb.append(map.containsKey(s1) ? map.get(s1) : "?");
            }else{
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}