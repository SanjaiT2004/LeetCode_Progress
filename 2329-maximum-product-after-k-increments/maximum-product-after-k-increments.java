class Solution {
    public int maximumProduct(int[] nums, int k) {
        double result = 1e9 + 7;
        long product = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int n : nums){
            queue.add(n);
        }
        while( k-- >0){
            int num = queue.poll();
            queue.add(num + 1);
        }
        while(!queue.isEmpty()){
            product *= queue.poll();
            product %= result;
        }
        return (int)product;
    }
}