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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy=new ListNode(0);
        dummy.next = head;
        ListNode prev =dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }

        ListNode Left_Node = prev.next;

        ListNode curr = prev.next;
        ListNode Next = curr.next;
        ListNode dummy2 = new ListNode(0);
        dummy2.next = Left_Node;
        ListNode prev2 = dummy2;

        for(int i=left;i<=right;i++){
            Next = curr.next;
            curr.next = prev2;
            prev2 = curr;
            curr=Next;
        }

        prev.next = prev2;
        Left_Node.next = Next;
        
        return dummy.next;
    }
}