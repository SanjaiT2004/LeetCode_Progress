/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int rb = 0 ;
        int re = m - 1 ;
        int cb = 0;
        int ce = n - 1 ;
        int nums[][] = new int[m][n];
        while(rb <= re && cb <= ce){
            for(int i=cb;i<=ce;i++,head= head!=null? head.next:null)
            nums[rb][i] = head!= null ? head.val : -1;
            rb++;
            if(rb > re)
            break;
            for(int i=rb;i<=re;i++,head= head!=null? head.next:null)
            nums[i][ce] = head!= null ? head.val : -1;;
            ce--;
            if(cb>ce)
            break;
            for(int i=ce;i>=cb;i--,head= head!=null? head.next:null)
            nums[re][i] = head!= null ? head.val : -1;;
            re--;
            if(rb > re)
            break;
            for(int i=re;i>=rb;i--,head= head!=null? head.next:null)
            nums[i][cb] = head!= null ? head.val : -1;;
            cb++;
            if(cb>ce)
            break;
        }
        return nums;
    }
}