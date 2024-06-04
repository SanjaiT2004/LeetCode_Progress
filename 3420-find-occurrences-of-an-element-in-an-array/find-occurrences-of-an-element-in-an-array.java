class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> set = new ArrayList<>();
        int len = nums.length;
        for(int i = 0;i < len;i++){
            if(nums[i] == x)
                set.add(i);
        }
        int len1 = queries.length;
        int arr[] = new int[len1];
        len = set.size();
        for(int i = 0;i<len1;i++){
            if(queries[i] <= len)
                arr[i] = set.get(queries[i] - 1);
            else
                arr[i] = -1;
        }
        return arr;
    }
}