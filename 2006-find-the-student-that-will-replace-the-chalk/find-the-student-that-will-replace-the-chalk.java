class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long total = 0;
        for(int n : chalk){
            total+=n;
        }
        k %= total;
        int idx = 0;
        for(int n : chalk){
            k-=n;
            if(k < 0)
                return idx;
            idx++;
        }
        return idx;
    }
}