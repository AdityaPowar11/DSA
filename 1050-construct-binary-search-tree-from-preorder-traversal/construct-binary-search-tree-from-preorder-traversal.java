class Solution {

    TreeNode helper(TreeNode root, int val){

        if(root==null)return new TreeNode(val);

        if(root.val>val) {
            if(root.left==null) root.left= new TreeNode(val);
            else helper(root.left,val);
        }
        else{
            if(root.right==null) root.right = new TreeNode(val);
            else helper(root.right,val);
        }
        return root;

    }
    public TreeNode bstFromPreorder(int[] preorder) {

        int n = preorder.length;
        TreeNode root = new TreeNode(preorder[0]);

        for(int i=1;i<n;i++){
            root = helper(root,preorder[i]);
        }
        return root;
        
    }
}