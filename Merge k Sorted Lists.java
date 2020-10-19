// Problem Link --> https://leetcode.com/problems/merge-k-sorted-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        if(size<1) return null;
        if(size<2) return lists[0];
        int last = size-1;
        while(last!=0)
        {
            int i =0;
            int j=last;
            while(i<j)
            {
                  lists[i]=mergeTwoLists(lists[i],lists[j]);
                  i++;
                  j--;
                
                    if(i>=j)
                    {
                        last=j;
                    }
            }         
        }           
        return lists[0];        
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res=null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<=l2.val){   // for moving the pointer ahead in the l1 direction
            res=l1;
            res.next=mergeTwoLists(l1.next,l2);  // calling the function recursively
        }
        else{  // for moving the pointer ahead in the l2 direction
            res=l2;
            res.next=mergeTwoLists(l1,l2.next);
        }
        
        return res;
    }
}
