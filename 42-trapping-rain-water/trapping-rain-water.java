class Solution {
    public int trap(int[] arr) {
        int c=0,k=0,max=0,i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
            k=i;
            }
            else{
            c+=max-arr[i];
            }
        }
        max=0;
        for(i=arr.length-1;i>k;i--){
             c-=arr[k]-arr[i];
            if(arr[i]>max)
            max=arr[i];
            else{
            c+=max-arr[i];
            }
        }
        return c;
    }
}