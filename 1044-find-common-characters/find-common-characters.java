class Solution {
    public List<String> commonChars(String[] words) {
        int len = words.length;
        List<String> list = new ArrayList<>();
        Map<Character,Integer> map[] = new HashMap[len];
        for(int i = 0;i<len;i++){
            map[i] = new HashMap<>();
        }
        for(int i = 0;i<len;i++){
            for(char ch : words[i].toCharArray()){
                map[i].put(ch,map[i].getOrDefault(ch,0)+1);
            }
        }
        char ch = ' ';
        int min  = Integer.MAX_VALUE;
        Boolean flag = false;
        for(int i = 0;i<26;i++){
            min  = Integer.MAX_VALUE;
            ch = (char)(i+'a');
            flag = true;
            for(int j = 0; j < len;j++){
                if(map[j].containsKey(ch)){
                    min = Math.min(min,map[j].get(ch));
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                for(int j = 0;j<min;j++)
                    list.add(ch+"");
            }
        }
        return list;
    }
}