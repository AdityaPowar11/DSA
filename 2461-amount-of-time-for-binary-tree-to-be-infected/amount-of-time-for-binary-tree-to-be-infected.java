
class Solution {

    public TreeNode getNode(TreeNode root,int start){
        if(root==null) return null;
        if(root.val == start) return root;
        TreeNode left = getNode(root.left,start);
        TreeNode right = getNode(root.right,start);

        if(left==null)
         return right;
        else
         return left;

    }

    public void preorder(TreeNode root,HashMap<TreeNode,TreeNode> parent){
        if(root==null)return;
        if(root.left!=null) parent.put(root.left,root);
        if(root.right!=null) parent.put(root.right,root);
        preorder(root.left,parent);
        preorder(root.right,parent);
    }


    public int amountOfTime(TreeNode root, int start) {

        TreeNode node = getNode(root,start);

        HashMap<TreeNode,TreeNode> parent = new HashMap<>();

        preorder(root,parent);
        
        HashMap<TreeNode,Integer> visted = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        visted.put(node,0);
        q.add(node);

        while(q.size()>0){
            TreeNode temp = q.remove();
            int level = visted.get(temp);
            if(temp.left!=null && !visted.containsKey(temp.left)){
                q.add(temp.left);
                visted.put(temp.left,level+1);
            }
            if(temp.right!=null && !visted.containsKey(temp.right)){
                q.add(temp.right);
                visted.put(temp.right,level+1);
            }
            if(parent.containsKey(temp) && !visted.containsKey(parent.get(temp))){
                q.add(parent.get(temp));
                visted.put(parent.get(temp),level+1);
            }
        }
        int max = -1;
        for(int i :visted.values()){
            if(max<i) max= i;
        }
        return max;

        
    }
}