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
    public ListNode reverseList(ListNode head) {
        ListNode new_Head = null;
        ListNode curr = null;
        while(head != null){
            curr = new ListNode(head.val,new_Head);
            new_Head = curr;
            head = head.next;
        }
        return new_Head;
    }
}