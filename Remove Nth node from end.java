// Problem Link --> https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode tmp=head,curr=head;
        int size=0;
        while(tmp!=null){
            
            tmp=tmp.next;
            size++;
        }
        
        
        int count=0;
        tmp=head;
        curr=head;
        if(size-n==0) return head.next;
        while(count!=size-n){
            curr=tmp;
            tmp=tmp.next;
            count++;
        }
        if(tmp!=null){
            curr.next=tmp.next;
        }
        else curr.next=null;
        return head;
    }
}
