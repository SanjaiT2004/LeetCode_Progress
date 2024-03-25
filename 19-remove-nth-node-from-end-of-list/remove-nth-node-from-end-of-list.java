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
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     ListNode temp = head ;
    //     int len =0;
    //     while(temp!=null){
    //         temp =temp.next;
    //         len++;
    //     }
    //     int k = len-n;
    //     if(k ==0){
    //         return head.next;
    //     }
    //     temp = head;
    //     ListNode prev = null;
    //     int cnt =0;
    //     while(temp!=null){
    //         if(cnt == k){
    //             break;
    //         }
    //         cnt++;
    //         prev=temp;
    //         temp=temp.next;
    //     }
    //     if(n==1){
    //     prev.next=null;
    //     }else{
    //         prev.next = temp.next;
    //     }
    //     return  head;
    // }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }
        if(findAndRemove(head, head, n) == -1) { // delete head node
            head = head.next;
        }
        return head;
    }

    public int findAndRemove(ListNode head, ListNode node, int n) {
        if(node.next == null) {
            return 0;
        }
        int length = findAndRemove(head, node.next, n) + 1;
        if(length == n) {
            node.next = node.next.next; //delete node
        }else if(head == node && length == n-1) {
            return -1; // delete head node 
        }
        return length;
    }
}