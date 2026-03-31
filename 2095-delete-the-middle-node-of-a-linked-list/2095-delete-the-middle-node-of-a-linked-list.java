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
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head == null || head.next == null) return null;
        ListNode temp = head;
        int cnt =0;

        while(temp != null)
        {
            cnt++;
            temp = temp.next;
        }
        
        temp = head;
        int i=1;
        int mid = (cnt)/2 +1;
        while(i < mid-1)
        {
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;
        return head;

    }
}