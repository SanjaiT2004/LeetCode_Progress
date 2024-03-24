class Solution {
    public int findDuplicate(int[] nums) {
        // int t=0;
        // Set<Integer> set=new HashSet<Integer>();
        // for(int i=0;i<nums.length;i++){
        //     if(set.contains(nums[i])){
               
        //        t= nums[i];
        //     }
        //     set.add(nums[i]);
        // }
        // return t;
        boolean [] a=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
         if(a[nums[i]]) return nums[i];

         a[nums[i]]=true;   
        }
        return -1;
    }
}