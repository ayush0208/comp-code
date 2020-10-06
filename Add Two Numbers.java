/*

Problem Link --> https://leetcode.com/problems/add-two-numbers/
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself. 

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:
The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.

*/

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode tmp=res;
        int carry=0;
        while(l1!=null && l2!=null){
            tmp.next= new ListNode( (l1.val+l2.val+carry)%10);
            carry=(l1.val+l2.val+carry)/10;
            l1=l1.next;
            l2=l2.next;
            tmp=tmp.next;
        }
        if(l1!=null && carry==0){
            tmp.next=l1;
        }
        else if (l2!=null && carry==0){
            tmp.next=l2;
        }
        else if (carry==1){
            if(l1!=null){
                while(l1!=null){
                    tmp.next= new ListNode((l1.val+carry)%10);
                    carry=(l1.val+carry)/10;
                    l1=l1.next;
                    tmp=tmp.next;
                }  
                if(carry!=0){
                   if (l1==null && l2==null){
                tmp.next= new ListNode(carry);
                tmp=tmp.next;
            }
               }
            }
           else if(l2!=null){
                while(l2!=null){
                    tmp.next= new ListNode((l2.val+carry)%10);
                    carry=(l2.val+carry)/10;
                    l2=l2.next;
                    tmp=tmp.next;
                }
               
               if(carry!=0){
                   if (l1==null && l2==null){
                tmp.next= new ListNode(carry);
                tmp=tmp.next;
            }
               }
               
            }
            else if (l1==null && l2==null){
                tmp.next= new ListNode(carry);
                tmp=tmp.next;
            }
        }
        
        return res.next;
    }
}
