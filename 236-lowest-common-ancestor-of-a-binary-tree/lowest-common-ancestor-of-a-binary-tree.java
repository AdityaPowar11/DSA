class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root,
                                          TreeNode p,
                                          TreeNode q) {

        TreeNode curr = root;

        while (curr != null) {

            if (p == curr || q == curr) {
                return curr;
            }

            boolean pLeft = contains(curr.left, p);
            boolean qLeft = contains(curr.left, q);

            if (pLeft && qLeft) {
                curr = curr.left;
            } 
            else if (!pLeft && !qLeft) {
                curr = curr.right;
            } 
            else {
                return curr;
            }
        }

        return null;
    }

    private boolean contains(TreeNode root, TreeNode target) {
        if (root == null) return false;

        if (root == target) return true;

        return contains(root.left, target) ||
               contains(root.right, target);
    }
}