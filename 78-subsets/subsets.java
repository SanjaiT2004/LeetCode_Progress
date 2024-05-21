class Solution {
    List<List<Integer>> list;
    public void backtrack(int[] nums,List<Integer> list1,int start){
        list.add(new ArrayList<>(list1));
        for(int i=start;i<nums.length;i++){
            list1.add(nums[i]);
            backtrack(nums,list1,i+1);
            list1.remove(list1.size() -1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,new ArrayList<>(),0);
        return list;
    }
}