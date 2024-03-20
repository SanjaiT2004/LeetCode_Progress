class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> list = new ArrayList<>();
        for(char c : map.keySet()){
            list.add(c);
        }
        Collections.sort(list,(a,b)->{
            return map.get(b) - map.get(a);
        });
        int max = map.get(list.get(0)) -1;
        int empty = max * n;
        for(int i=1;i<list.size();i++){
            empty -= Math.min(max,map.get(list.get(i)));
        }
        if(empty > 0)
        return tasks.length+empty;
        else
        return tasks.length;
    }
}