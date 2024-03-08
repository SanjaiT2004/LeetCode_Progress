class Solution {
    static int arr[] = new int[101];
    public int maxFrequencyElements(int[] nums) {
        int max = 0;
        for(int n : nums){
        arr[n]++;
        max = Math.max(max,arr[n]);
        }
        int maxFreq = 0;
        for(int i=1 ;i<=100;i++){
            if(arr[i]!= 0 && arr[i] == max)
            maxFreq+=max;
            arr[i] = 0;
        }
        return maxFreq;
    }
}