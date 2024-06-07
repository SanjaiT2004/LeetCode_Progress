class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        String arr[] = sentence.split(" ");
        StringBuilder sb = new StringBuilder(""); 
        int len = dict.size();
        for(int i = 0;i<len;i++){
            for(int j =0;j<arr.length;j++){
                if(arr[j].startsWith(dict.get(i))){
                    arr[j] = dict.get(i);
                }
            }
        }
        for(String s : arr)
        sb.append(s+" ");
        return sb.substring(0,sb.length() -1).toString();
    }
}