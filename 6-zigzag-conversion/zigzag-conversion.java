class Solution {
    public String convert(String s, int n) {
        StringBuilder arr[] = new StringBuilder[n];
        for(int i=0;i<n;i++)
        arr[i]= new StringBuilder();
        Boolean flag = true;
        int len = s.length();
        for(int i=0;i<len;){
            for(int j=0;j<n && i<len;j++,i++){
                arr[j].append(s.charAt(i));
            }
            for(int j=n-2;j>0&&i<len;j--,i++){
                arr[j].append(s.charAt(i));
            }
            
        }
        
        for(int i=1;i<n;i++){
            arr[0].append(arr[i]);
        }
        return arr[0].toString();
    }
}