class Solution {
    TreeNode helper(List<Integer> l,int lo,int h){

        if(lo>h)return null;
        int mid=(lo+h)/2;
        TreeNode root = new TreeNode(l.get(mid));

        root.left =helper(l,lo,mid-1);
        root.right =helper(l,mid+1,h);

        return root;

    }
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            l.add(temp.val);
            temp = temp.next;
        }

        return helper(l,0,l.size()-1);

        
    }
}