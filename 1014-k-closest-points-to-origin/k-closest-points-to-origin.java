class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Map<Double,ArrayList<int[]>> map = new HashMap<>();
        for(int a[] : points){
            double sqrt = Math.sqrt(a[0] * a[0] + a[1] * a[1]);
            if(!map.containsKey(sqrt)){
                map.put(sqrt,new ArrayList<>());
            }
            map.get(sqrt).add(a);
        }
        PriorityQueue<Double> queue = new PriorityQueue<Double>();
        for(double key : map.keySet())
            queue.offer(key); 
        int arr[][] = new int[k][2];
        while(k > 0){
            double key = queue.poll(); 
            int len = map.get(key).size();
            for(int i = 0;i < len;i++){
                k--;
                if(k<0)
                    break;
                arr[k][0] = map.get(key).get(i)[0];
                arr[k][1] = map.get(key).get(i)[1];
            }
        }
        return arr;
    }
}