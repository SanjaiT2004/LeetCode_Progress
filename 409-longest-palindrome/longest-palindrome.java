class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int sum = 0;
        Boolean flag = true;
        char ch = ' ';
        for(int i = 65;i<123;i++){
            ch = (char) i;
            if(map.containsKey(ch)){
                if(map.get(ch) % 2 == 0){
                    sum += map.get(ch);
                }else{
                    flag = false;
                    sum += map.get(ch) - 1;
                }
            }
        }
        return flag ?sum:sum+1;
    }
}