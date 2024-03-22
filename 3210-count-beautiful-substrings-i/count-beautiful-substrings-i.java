class Solution {
    public int beautifulSubstrings(String s, int k) {
        int cnt1 = 0;
        int cnt2 = 0;
        int len = s.length();
        int cnt = 0;
        for(int i = 0;i<len;i++){
             cnt1 = 0;
             cnt2 = 0;
            for(int j = i;j<len;j++){
                char ch = s.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    cnt1++;
                else
                    cnt2++;
                if(cnt1 == cnt2 && (cnt1 * cnt2) % k == 0)
                    cnt++;
            }
        }
        return cnt;
    }
}