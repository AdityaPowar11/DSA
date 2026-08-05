
class Solution {

    public ListNode removeElements(ListNode head, int val) {

        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        dummy.next =head;

        while (temp != null) {

            if (temp.val == val) {
                prev.next = temp.next;
            }
            else {
                prev = temp;
            }

            temp=temp.next;
        }

        return dummy.next;
    }
}