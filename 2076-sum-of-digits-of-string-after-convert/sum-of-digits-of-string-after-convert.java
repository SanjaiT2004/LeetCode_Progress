class Solution {
    public int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public int getLucky(String s, int k) {
        int sum = 0;
        int len = s.length();
        for(int i=0;i<len;i++)
        sum += sumOfDigits(s.charAt(i)-96);
        while(k-- >1){
            sum = sumOfDigits(sum);
        }
        return sum;
    }
}