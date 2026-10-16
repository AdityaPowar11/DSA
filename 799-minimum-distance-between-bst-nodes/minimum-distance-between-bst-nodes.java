/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode prev = null;
    int min = Integer.MAX_VALUE;
    void helper(TreeNode root){
        if(root==null)return;

        helper(root.left);
        if(prev !=null){
            int diff =root.val-prev.val;
            min = Math.min(min, diff);
        }
        prev=root;
        helper(root.right);

    }
    public int minDiffInBST(TreeNode root) {
        TreeNode prev = null;
        min = Integer.MAX_VALUE;

        helper(root);
        return min;
    }
}