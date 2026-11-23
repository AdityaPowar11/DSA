
class Solution {

    ListNode reverse(ListNode head) {
        

        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode Next = curr.next;
            curr.next= prev;
            prev =curr;
            curr=Next;
        }


        return prev;

    }


    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow =slow.next;
        }

        ListNode ans = reverse(slow.next);

        ListNode temp1 = head;
        ListNode temp2 = ans;

        while(temp2!=null){
            if(temp1.val!=temp2.val)return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    
        
    }
}