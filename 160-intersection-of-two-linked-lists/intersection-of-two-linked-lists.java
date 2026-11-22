public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode t1 = headA;
        ListNode t2 = headB;
        int size1=0;
        int size2=0;

        while(t1!=null){
            t1=t1.next;
            size1++;
        }

        while(t2!=null){
            t2=t2.next;
            size2++;
        }


        if(size1>size2){
            t1=headA;
            t2=headB;
            for(int i=0;i<size1-size2;i++){
                t1=t1.next;
            }
        
        }
        else{
            t1=headA;
            t2=headB;
            for(int i=0;i<size2-size1;i++){
                t2 = t2.next;
            }
        }

        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }

        return t1;
        

        
    }
}