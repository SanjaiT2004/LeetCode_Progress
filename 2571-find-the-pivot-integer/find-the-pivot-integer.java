class Solution {
    public int pivotInteger(int n) {
        int sum = n * ( n + 1) / 2;
        n = (int)Math.sqrt(sum);
        return n * n == sum ? n : -1 ;
    }
}