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
    public void reorderList(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode curr = slow.next;
        ListNode newHead = slow.next;

        slow.next = null;
        ListNode prev = null;
        ListNode Next = null;

        while (curr!= null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        ListNode te = head;
        ListNode tc = prev;
 
        while (tc != null) {

            ListNode t1 = te.next;
            ListNode t2 = tc.next;

            te.next = tc;
            tc.next = t1;

            te = t1;
            tc =t2;

        }

        // ListNode temp = head;

        // while(slow!=null){
        //     Next = temp.next;
        //     temp.next = slow;
        //     slow = slow.next;
        //     temp =
        // }

    }
}