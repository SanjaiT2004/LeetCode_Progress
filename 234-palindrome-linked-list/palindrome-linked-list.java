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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = 0;
        while(head != null){
          list.add(head.val);
          len++;
          head = head.next;
        }
        int j = len-1;
        for(int i=0;i<=len/2;i++,j--){
          if(list.get(i) != list.get(j))
          return false;
        }
        return true;
    }
}