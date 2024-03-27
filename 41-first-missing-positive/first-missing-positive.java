class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k=1,l=nums.length;
        for(int i=0;i<l;i++){
           if(nums[i]<k){
               continue;
           }
           else if(nums[i]==k){
               k++;
               continue;
           }
           else{
               return k;
           }
        }
            
        return k;
    }
}