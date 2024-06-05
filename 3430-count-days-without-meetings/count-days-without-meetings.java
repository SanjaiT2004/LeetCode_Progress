class Solution {
    public int countDays(int days, int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]> merge= new LinkedList<>();
        for(int[] interval:intervals){
            if(merge.isEmpty()||merge.getLast()[1]< interval[0]){
                merge.add(interval);
            }else{
                merge.getLast()[1]=Math.max(merge.getLast()[1],interval[1]);
            }
        }
        int len = merge.size();
        int sum = 0;
        for(int i = 0;i<len-1;i++){
            sum += (merge.get(i+1)[0] - merge.get(i)[1]) - 1;
        }
        sum += merge.get(0)[0] - 1;
        sum += days - merge.get(len-1)[1];
        return sum;

    }
}