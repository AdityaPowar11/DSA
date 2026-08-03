
class Solution {

    public static ListNode reverse(ListNode head){

    ListNode prev=null;
    ListNode Next = null;
    ListNode curr = head;

    while(curr!=null){
        Next = curr.next;
        curr.next=prev;
        prev=curr;
        curr = Next;
    }
    return prev;
}
    public int pairSum(ListNode head) {

        int max =0;

        ListNode fast = head ;
        ListNode slow= head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }


        ListNode temp = reverse(slow.next);
        slow.next=temp;

        ListNode p1=head;
        ListNode p2=slow.next;

        while(p2!=null){
            max = Math.max(max,p1.val+p2.val);
            p1 = p1.next;
            p2=p2.next;
        }

        return max;
        
    }
}