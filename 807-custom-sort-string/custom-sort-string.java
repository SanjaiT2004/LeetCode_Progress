class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,StringBuilder> map = new HashMap<>();
        for(char ch : order.toCharArray())
            map.put(ch,new StringBuilder(""));
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch))
            map.get(ch).append(ch);
            else
            sb.append(ch);
        }
        int len = order.length();
        for(int i = len - 1 ;i>=0;i--)
            sb.append(map.get(order.charAt(i)).toString());
        return sb.reverse().toString();
    }
}