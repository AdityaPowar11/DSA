
class Solution {

    ListNode reverse(ListNode head){
        ListNode prev =null;
        ListNode curr = head;

        while(curr!=null){
            ListNode Next = curr.next;
            curr.next=prev;
            prev = curr;
            curr=Next;
        }

        return prev;

    }
    public boolean isPalindrome(ListNode head) {

        ListNode dummy = new ListNode(head.val);
        ListNode t1 = dummy;
        ListNode temp = head.next;

        while(temp!=null){

            ListNode node = new ListNode(temp.val);

            t1.next =node ;
            t1=t1.next;
            temp= temp.next;
        }

        ListNode ans = reverse(dummy);


        ListNode temp1 = head;
        ListNode temp2 = ans;

        while(temp1!=null){
            if(temp1.val!=temp2.val)return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
        
    }
}