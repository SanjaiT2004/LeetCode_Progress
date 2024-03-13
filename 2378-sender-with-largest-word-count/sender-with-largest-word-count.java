class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> map = new HashMap<>();
        int max = 0;
        int len = 0;
        int size = senders.length;
        String res = "";
        for(int i = 0;i<size;i++){
            String arr[] = messages[i].split(" ");
            len = arr.length;
            if(map.containsKey(senders[i]))
            map.put(senders[i],map.get(senders[i]) + len);
            else
            map.put(senders[i],len);
            len = map.get(senders[i]);
            if(len > max){
                max = len;
                res = senders[i];
            }else if(len == max){
                res = res.compareTo(senders[i]) > 0? res : senders[i];             
            }
        }
    return res;
    }
}