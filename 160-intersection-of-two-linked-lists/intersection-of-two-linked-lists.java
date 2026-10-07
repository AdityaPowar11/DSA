public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode t1 = headA;
        ListNode t2 = headB;

        int count=0;
        int count2 = 0;

        while(t1!=null){
            t1 = t1.next;
            count++;
        }

        while(t2 != null){
            t2 = t2.next;
            count2++;
        }

        int n ;
        ListNode temp;
        ListNode temp2;
        if(count > count2){
            n = count - count2;
            temp = headA;
            temp2 = headB;
        }
        else{
            n= count2 - count;
            temp = headB;
            temp2 = headA;
        }

        for(int i =0;i<n;i++){
            temp = temp.next;
        }


        while(temp!=temp2){
            temp =temp.next;
            temp2 = temp2.next;
        }

        return temp;

        
    }
}