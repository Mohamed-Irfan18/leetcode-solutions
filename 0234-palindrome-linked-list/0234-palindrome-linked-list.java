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
class Solution
{
    public boolean isPalindrome(ListNode head) 
    {
       ListNode slow = head;
       ListNode fast = head;

       while(fast != null && fast.next != null)
       {
           slow = slow.next;
           fast = fast.next.next;
       }

       if(fast != null)
       {
           slow = slow.next;
       }

       ListNode prev = null;
       ListNode curr = slow;

       while(curr != null)
       {
          ListNode temp = curr.next;
          curr.next = prev;
          prev = curr;
          curr = temp;
       }
       
       ListNode slow1 = head;
       ListNode fast1 = prev;

       while(fast1 != null)
       {
          if(slow1.val == fast1.val)
          {
            return true;
          }

          slow1 = slow1.next;
          fast1 = fast1.next;
       }

       return false;
    }
}