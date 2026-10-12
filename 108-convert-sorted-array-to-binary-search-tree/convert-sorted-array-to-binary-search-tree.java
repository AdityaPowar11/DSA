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
        TreeNode construct(int []nums,int l,int h){
            if(l>h)return null;
            int mid = (l+h)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = construct(nums,l,mid-1);
            root.right = construct(nums,mid+1,h);
            return root;
        }

    public TreeNode sortedArrayToBST(int[] nums) {
        int h = nums.length-1;
        int l =0;
        TreeNode root = construct(nums,l,h);
        return root;
        
    }
}