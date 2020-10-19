// Problem Link --> https://leetcode.com/problems/merge-two-sorted-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode temp=l;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                temp.next = new ListNode(l1.val);
                temp=temp.next;
                l1=l1.next;
            }
            else
            {
                temp.next = new ListNode(l2.val);
                temp=temp.next;
                l2=l2.next;
            }
        }
        if(l1==null) temp.next=l2;
        else if(l2==null) temp.next=l1;
        
        return l.next;
        
    }
}
