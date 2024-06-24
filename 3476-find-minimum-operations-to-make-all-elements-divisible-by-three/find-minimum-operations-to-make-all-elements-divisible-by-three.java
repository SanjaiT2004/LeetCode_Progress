class Solution {
    public int minimumOperations(int[] nums) {
        int min = 0;
        for(int n : nums){
            if( n % 3 != 0)
                min++;
        }
        return min;
    }
}