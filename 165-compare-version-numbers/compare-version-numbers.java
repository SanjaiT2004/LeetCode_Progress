class Solution {
    public int compareVersion(String s, String s1) {
        String arr[] = s.split("\\.");
        String arr1[] = s1.split("\\.");
        int m1 = arr.length;
        int n1 = arr1.length;
        int len = Math.max(arr.length,arr1.length);
        int m = 0,n = 0;
        for(int i=0;i<len;i++){
            m = i< m1 ? Integer.parseInt(arr[i]):0;
            n = i < n1 ? Integer.parseInt(arr1[i]):0;
            if(m > n)
            return 1;
            else if(n > m)
            return -1;
        }
        return 0;
    }
}