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
    public ListNode mergeInBetween(ListNode head1, int a, int b, ListNode head2) {
        ListNode fpointer = null;
        ListNode lpointer = null;
        int cnt = 1;
        ListNode temp = head1;
        while(temp != null){
            if(cnt == a)
            fpointer = temp;
            if(cnt == b)
            lpointer = temp.next;
            cnt++;
            temp = temp.next;
        }
        fpointer.next = head2;
        temp = head2;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = lpointer.next;
        return head1;
    }
}