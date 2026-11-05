class Solution {

    public int height(TreeNode root,int []dp) {
        if (root == null)return 0;

        int left = height(root.left,dp);
        int right = height(root.right,dp);

        int path = left + right;
        dp[0] =Math.max(dp[0],path);
        return 1 + Math.max(left,right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int []dp ={0};
        height(root,dp);
        return dp[0];

    }
}