/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {


        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow==fast){
                ListNode temp=head;
                int count =0;
                while(temp!=slow){
                    temp =temp.next;
                    slow=slow.next;
                    count++;
                }
                return temp;
            }
        }

        return null;
        
    }
}